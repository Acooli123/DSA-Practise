class RecursiveBubbleSort {
    public static void RecursiveBubbleSort(int arr[], int n){
        if(n == 1) return;

        // move largest element at the last
        for(int i=0; i <= n-2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        RecursiveBubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        int n = arr.length;
        RecursiveBubbleSort(arr, n);
        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}