class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
      int n = bloomDay.length ;
      if(n<(long)m*k) return -1 ; 
      int lo = Arrays.stream(bloomDay).min().getAsInt() ; 
      int hi = Arrays.stream(bloomDay).max().getAsInt() ; 
     int ans = hi ;  
      while(lo<=hi){
        int mid = (lo+hi)/2 ;
       if( possible(bloomDay,mid,m,k)){
         ans = mid ;
         hi = mid-1 ; 
       }
       else {
        lo = mid+1 ; 
       } 
      }
    return ans  ; 
    }
  public boolean possible(int[] arr , int day , int m , int k){
        int count = 0 ; int b = 0 ;
        for(int i =0 ;i<arr.length ;i++){
            if(arr[i]<=day){
                count ++ ;
                if(count==k){
                    b++ ;
                    count = 0 ;
                }
                 } else {
                    count = 0 ; 
                }
                if(b>=m) return true ;
            }
            return false ; 
        }
}