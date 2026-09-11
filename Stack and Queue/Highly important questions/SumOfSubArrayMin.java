class SumOfSubArrayMin {

    public static int sumOfSubArrayMin(int arr[]){
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            int min = arr[i];

            for(int j=i; j<n; j++){
                min = Math.min(min, arr[j]);
                sum += min;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5};

        int ans = sumOfSubArrayMin(arr);
        System.out.println("Sum of the sub-array minimum is : "+ans);
    }
}