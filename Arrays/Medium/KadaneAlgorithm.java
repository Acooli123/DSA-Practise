class KadaneAlgorithm {

    public static int longestSubArraySum(int arr[]){
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, -2, 7, -4};
        int longestSubArraySum = longestSubArraySum(arr);
        System.err.print("Longest subArray sum of this array is : " +longestSubArraySum);
    }
}