class Solution {
    public int splitArray(int[] nums, int k) {
     int lo = Arrays.stream(nums).max().getAsInt();
     int hi = Arrays.stream(nums).sum() ;
     int ans = -1 ;
     while(lo<=hi){
        int mid = (lo+hi)/2 ;
        if(possible(nums,k,mid)){
            ans = mid ; 
            hi = mid-1 ;
        } else lo = mid+1 ; 
     }
     return ans ; 
    }
    boolean possible(int[] arr ,int k , int limit){
        int split = 1 ; int page = 0 ;
         for(int i=0;i<arr.length ;i++){
            if(arr[i]>limit)return false ;
            if(arr[i]+page>limit){
                split ++ ;
                page = arr[i];
            }
            else page +=arr[i] ;
         }
         if(split>k)return false ; 
         else return true ; 
    }
}