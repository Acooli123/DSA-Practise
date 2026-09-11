import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class FourSum {

    public static List<List<Integer>> fourSum(int arr[], int target){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        if(arr == null && n < 4)    return ans;
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;

            for(int j=i+1; j<n; j++){
                if(j > 0 && arr[j] == arr[j-1]) continue;

                int left = j+1;
                int right = n-1;

                while(left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum == target){
                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        left++;
                        right--;

                        while(left < right && arr[left] == arr[left+1]){
                            left++;
                        }

                        while(left < right && arr[right] == arr[right-1]){
                            right--;
                        }
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target sum : ");
        int target = sc.nextInt();

        System.out.println("4Sum of this array is : " +fourSum(arr, target));
    }
}