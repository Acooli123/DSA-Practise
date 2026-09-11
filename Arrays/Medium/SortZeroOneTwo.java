class SortZeroOneTwo {

    public static void sortZeroOneTwo(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array which contains only 0, 1 and 2 is : ");
        for(int i=0; i<nums.length; i++){
            System.err.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,2,0,1,1,2,0};
        sortZeroOneTwo(arr);
    }
}