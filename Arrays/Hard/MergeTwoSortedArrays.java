class MergeTwoSortedArrays {

    public static void merge(int arr1[], int arr2[], int n, int m){
        int i = n-1;
        int j = m-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr1[k--] = arr1[i--];
            }else{
                arr1[k--] = arr2[j--];
            }
        }

        while(j >= 0){
            arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {-5, -2, 4, 5, 0, 0, 0};
        int arr2[] = {-3, 1, 8};

        int n = 4;
        int m = arr2.length;

        System.out.println("After merging two arrays without extra space is : ");
        merge(arr1, arr2, n, m);

        for(int i : arr1){
            System.out.print(i +" ");
        }
    }
}