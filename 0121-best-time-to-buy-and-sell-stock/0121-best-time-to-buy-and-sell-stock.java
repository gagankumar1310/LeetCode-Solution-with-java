class Solution {
    public int maxProfit(int[] arr) {
    int maxProfit = 0 ; 
    int minp = arr[0] ; 
    int pro = 0 ; 
    for(int i = 0 ; i<arr.length;i++){
        pro= arr[i]-minp ; 
         maxProfit = Math.max(maxProfit , pro);
        minp = Math.min(minp , arr[i]) ; 
    }
    return maxProfit ; 
    }
}