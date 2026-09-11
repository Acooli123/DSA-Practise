import java.util.Scanner;

class SubArraySum {

    public static int countgthOfSubArraySum(int arr[], int k){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];

                if(sum == k){
                    count = Math.max(count, j - i + 1);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        System.err.print("Enter the value which u want to check : ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.err.println("Number of sub arrays with given sum is : " +countgthOfSubArraySum(arr, k));
    }
}