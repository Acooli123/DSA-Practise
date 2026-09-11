class GetSingleAppearElements {

    public static int getSinglElement(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int num = arr[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == num){
                    count++;
                }
            }

            if(count == 1)  return num;
        }

        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {1,1,3,2,4,4,3,5,5,6,6};
        int result = getSinglElement(arr);
        System.err.println("That elements which which occurs single times is : "+result);
    }
}