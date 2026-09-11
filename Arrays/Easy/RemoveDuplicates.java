class RemoveDuplicates {
    public static void removeDuplicates(int arr[]){
        int n = arr.length;
        if(n == 0) return;
        int index = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }
        System.err.println("After removing duplicates : ");
        for(int i=0; i<index; i++){
            System.err.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,2,2,3,3,4,4};
        removeDuplicates(arr);
    }
}