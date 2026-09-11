import java.util.*;

class LongestSubarrayWithSumK {

    public static int longestSubarray(int arr[], int k){
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;

        while(right < n){
            sum += arr[right];

            while(sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.err.print("Enter sum of the elements to find longest subArray : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int result = longestSubarray(arr, k);
        System.err.println("Longest subArray of the array is : " +result);
    }
}