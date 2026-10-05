class Solution {
    public int search(int[] nums, int target) {
     int n = nums.length ; 
     int idx = -1 ;    
     int lo = 0 ; int hi = n-1 ;
     if(n==1&& nums[0]!=target) return idx ;
     if(n==1&&nums[0]==target) return 0 ; 
     while(lo<=hi){
        int mid = (lo+hi)/2 ; 
        if(nums[mid]==target) idx = mid ;
    // left half is sorted or not 
      if(nums[lo]<=nums[mid]){
        if(nums[lo]<=target && target<=nums[mid]){
            hi = mid-1 ;
        }
        else lo = mid+1 ; 
      }
      else {
        if(nums[mid]<target && target <= nums[hi]){
               lo = mid+1 ;
        }
        else hi = mid -1 ; 
      }
     }
     return idx ; 
    }
}