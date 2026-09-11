import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {

    public static List<List<Integer>> threeSum(int arr[]){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        if(arr == null || n < 3)    return ans;
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            // skip consider first duplicate
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    
                    left++;
                    right--;

                    while(left < right && (arr[left] == arr[left+1])){
                        left++;
                    }

                    while(left < right && (arr[right] == arr[right-1])){
                        right--;
                    }

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println("3Sum of this array is : " +threeSum(arr));
    }
}