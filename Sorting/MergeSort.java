import java.util.*;

class MergeSort {

    public static void MergeSort(int arr[], int low, int high){
        if(low>=high)   return;
        int mid = (high + low)/2;
        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }

    public static void Merge(int arr[], int low, int mid, int high) {
        List<Integer> merge = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left] < arr[right]){
                merge.add(arr[left]);
                left++;
            }else{
                merge.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            merge.add(arr[left]);
            left++;
        }

        while(right<=high){
            merge.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = merge.get(i - low);
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        MergeSort(arr, 0, 4);
        System.out.println("Sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}