class LinearSearch {

    public static void linearSearch(int arr[], int key){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                System.err.println(key+" is found at index "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,10,20,40,30,60};
        linearSearch(arr, 10);
    }
}