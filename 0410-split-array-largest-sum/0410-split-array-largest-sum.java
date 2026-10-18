class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = Arrays.stream(nums).max().getAsInt() ;
        int hi = Arrays.stream(nums).sum() ;
        int ans = -1 ; 
        while(lo<=hi){
            int mid = (lo+hi)/2 ;
            if(possible(nums , mid , k)){
                ans = mid ; 
                hi = mid-1 ;
            }
            else lo = mid+1 ; 
        }
        return ans ; 
    }
    boolean possible(int[] arr , int bar, int std){
        int allocate = 1 ; int page = 0 ;
        int n = arr.length ;
        for(int i=0;i<n;i++){
            if(bar<arr[i]) return false ;
            if(page+arr[i]>bar){
                allocate++ ;
                page = arr[i];
            }
            else page+=arr[i];
        }
        if(allocate>std) return false ;
        else return true ; 
    }
}