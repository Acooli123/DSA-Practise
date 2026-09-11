class MajorityElement {

    public static int majorityElement(int arr[]){
        int n = arr.length;
        int num = arr[0];
        int count = 1;
        for(int i=0; i<n; i++){
            if(arr[i] == num){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                num = arr[i];
                count = 1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int arr[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int majorityElement = majorityElement(arr);
        System.err.println("Majority element in the array is : " +majorityElement);
    }
}