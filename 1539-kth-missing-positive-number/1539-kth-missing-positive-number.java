class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ; int lo = 0 ; int hi = n-1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2 ;
            int correct = mid+1 ;
            int miss = arr[mid]-correct ;
            if(miss>=k) hi = mid-1 ;
            else lo = mid+1 ;
        }
        return hi+k+1 ; 
    }
}