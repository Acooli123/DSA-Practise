import java.util.*;

class LongestConsecutive {

    public static int longestConsecutive(int arr[]){
        int n = arr.length;
        if(n == 0)  return 0;

        Arrays.sort(arr);

        int longest = 1;
        int current = 1;

        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1] + 1){
                current++;
            }else if(arr[i] == arr[i-1]){
                continue;   // ignore duplicate elements
            }else{
                current = 1;
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        System.err.print("Length of longest consecutive elements of the array is : " + longestConsecutive(arr));
    }
}