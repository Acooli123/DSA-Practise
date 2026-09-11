class RearrangeElementsBySign {

    public static int[] reArrangeElementsBySign(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                ans[posIndex] = arr[i];
                posIndex += 2;
            }else{
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, -1, -3, -4};
        System.err.println("After re-arranging elements by sign : ");
        int res[] = reArrangeElementsBySign(arr);
        int n = res.length;
        for(int i=0; i<n; i++){
            System.err.print(res[i]+" ");
        }
    }
}