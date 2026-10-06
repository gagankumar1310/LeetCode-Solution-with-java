class Solution {
    public int findMin(int[] arr) {
        int n = arr.length ; 
        int l = 0 ; int h = n-1 ;
        int min = Integer.MAX_VALUE ;
        while(l<=h){
            int mid = (l+h)/2 ; 
            // check which half is sorted 
            if(arr[l]<=arr[mid]){
            min = Math.min(min , arr[l]) ;
                l = mid+1 ;
            }
            else {
                min = Math.min(min, arr[mid]) ;
                h = mid-1 ; 
            }
        }
       return min ; 
    }
}