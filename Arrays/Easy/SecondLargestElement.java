class SecondLargestElement {
    public static int largestElement(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    // swap nums[j] and nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }

        return nums[n-2];
    }

    public static void main(String args[]){
        int nums[] = {12, 5, 4, 10, 50, 45};
        int secondLargest = largestElement(nums);
        System.out.println("Second largest elemnt is "+secondLargest);
    }
}