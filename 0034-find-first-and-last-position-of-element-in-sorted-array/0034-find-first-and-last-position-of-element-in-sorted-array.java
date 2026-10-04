class Solution {
    public int[] searchRange(int[] arr, int target) {
       int n = arr.length ; 
       int id1 = -1 ; int l = 0 ; int h = n-1 ;
       int id2 = -1 ; int lo = 0 ; int hi = n-1 ; 
       while(l<=h){
        int mid =(l+h)/2 ; 
        if(arr[mid]>target) h = mid-1 ;
        else if(arr[mid]<target) l= mid+1 ;
        else {
            // first position 
            h = mid-1 ; 
            id1 = mid ; 
        } 
       }
       while(lo<=hi){
        int mid = (lo+hi)/2 ;
        if(arr[mid]>target) hi = mid-1 ;
        else if(arr[mid]<target) lo = mid+1 ; 
        else {
            // last position 
            id2 = mid ;  
            lo = mid+1 ;
        } 
       }
       return new int[] {id1 ,id2} ;
    }
}