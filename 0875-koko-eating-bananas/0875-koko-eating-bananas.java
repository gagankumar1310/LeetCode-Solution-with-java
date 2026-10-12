class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int n = piles.length ; 
    int  lo = 1 ; int hi = Arrays.stream(piles).max().getAsInt() ;
 int ans = 0 ;
     while(lo<=hi){
       int mid = (lo+hi)/2 ;
       long total = 0 ;
        for(int ele : piles){
          total += (ele+(long)mid-1)/mid ; 
        }
        if(total>h) lo = mid+1 ;
        else {
            ans = mid ; 
            hi = mid-1 ; 
        }
     }
        return ans ; 
    }
}