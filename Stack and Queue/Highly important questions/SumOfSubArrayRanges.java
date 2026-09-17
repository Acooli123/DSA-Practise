class SumOfSubArrayRanges {

    public static int sumOfSubArrayRanges(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            int longest = arr[i], smallest = arr[i];

            for(int j=i+1; j<n; j++){
                longest = Math.max(longest, arr[j]);
                smallest = Math.min(smallest, arr[j]);

                int range = longest - smallest;
                sum += range;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 7, 6, 5};
        int res = sumOfSubArrayRanges(arr);
        System.out.println("Sum of sub-array ranges is : " + res);
    }
}