class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    int n = nums.length ;
    if(n>threshold) return -1 ;  
    int lo = 1 ; int hi = Arrays.stream(nums).max().getAsInt() ;
    while(lo<=hi){
        int mid = (lo+hi)/2 ;
         if(sumOfD(nums ,mid)<=threshold){
            hi = mid-1 ;
         }
         else {
            lo = mid+1 ; 
         }
    }
    return lo ; 
    }
    public int sumOfD(int[] nums , int div){
        int sum = 0 ; int n = nums.length ; 
        for(int i=0 ;i<n;i++){
            sum += (nums[i]+div-1)/div ;
        }
        return sum ; 
    }
}