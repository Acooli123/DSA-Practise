class BuyAndSellStocks {

    public static int maxProfit(int arr[]){
        int n = arr.length;
        int minBuyPrice = arr[0];
        int maxProfit = 0;

        for(int i=1; i<n; i++){
            int profit = arr[i] - minBuyPrice;
            maxProfit = Math.max(profit, maxProfit);
            minBuyPrice = Math.min(arr[i], minBuyPrice);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {1, 7, 5, 3, 6, 4};
        int maxProfit = maxProfit(arr);
        System.err.print("Maximum profit from buy and sell stock is : " +maxProfit);
    }
}