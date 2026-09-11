class MoveZerosToEnd {

    public static void moveZerosToEnd(int arr[]){
        int n = arr.length;
        int index = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=index; i<n; i++){
            arr[i] = 0;
        }

        System.err.println("After move zeros to the end of the array : ");
        for(int i=0; i<n; i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,6,0,5,6,0};
        moveZerosToEnd(arr);
    }
}