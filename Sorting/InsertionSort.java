// Time complexity O(n^2)

public class InsertionSort{
    public static void InsertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){

                // swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }

        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        InsertionSort(arr);
    }
}