class Solution {
    public int maxProfit(int[] arr) {
        int profit = 0;
        int j=1,buy=arr[0];
        while(j<arr.length){
            if(arr[j]<buy) buy = arr[j];
            else if(arr[j]-buy > profit)
                profit = arr[j]-buy;
            j++;
        }
        return profit;
    }
}
