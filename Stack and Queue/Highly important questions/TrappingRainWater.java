class TrappingRainWater {

    public static int rainWater(int arr[]){
        int n = arr.length;
        int sum = 0;
        int lmax[] = new int[n];    lmax[0] = arr[0];
        int rmax[] = new int[n];    rmax[n-1] = arr[n-1];

        for(int i=1; i<n; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }

        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }

        for(int i=0; i<n; i++){
            sum += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};

        int ans = rainWater(arr);
        System.out.println("water is tapped in between bars is : " +ans + " units.");
    }
}