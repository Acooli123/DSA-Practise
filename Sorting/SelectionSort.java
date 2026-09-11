// Time complexity O(n^2)

class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length -1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            // swap arr[min] and arr[i]
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }

    }

    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
    }
}