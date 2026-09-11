import java.util.Scanner;

class TwoSum {

    public static String TwoSumExists(int arr[], int target){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static int[] TwoSum(int arr[], int target){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {-6, 7, 1, -7, 6, 2};
        System.out.print("Enter target sum to find out : ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        String ans = TwoSumExists(arr, target);
        System.out.println("Is twoSum is formed from this array : " +TwoSumExists(arr, target));

        if(ans == "YES"){
            int result[] = TwoSum(arr, target);
            System.err.println("["+ result[0] + "," + result[1] + "]");
        }
    }
}