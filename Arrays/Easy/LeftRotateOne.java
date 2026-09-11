class LeftRotateOne {

    public static void leftRotateOneElement (int arr[]){
        int n = arr.length;
        int left = arr[0];
        for(int i=1; i<n; i++){
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = left;

        System.err.println("After left rotation of one element : ");
        for(int i=0; i<n; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        leftRotateOneElement(arr);
    }
}