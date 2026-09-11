class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int arr[]){
        int n = arr.length;
        int count = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,0,1,1,1,1,1};
        int result = maxConsecutiveOnes(arr);
        System.err.println("Maximum consecutive ones in the array is : " + result);
    }
}