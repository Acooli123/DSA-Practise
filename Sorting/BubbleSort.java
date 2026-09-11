// Time complexity O(n^2)

class BubbleSort{
    public static void BubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){

                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {12, 5, 4, 10, 50, 45};
        BubbleSort(arr);
    }
}