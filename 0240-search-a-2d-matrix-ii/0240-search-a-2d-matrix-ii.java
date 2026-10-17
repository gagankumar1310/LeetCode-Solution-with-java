class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
    int n = arr.length ; int m = arr[0].length ; 
    for(int i =0 ;i<n;i++){
        int lo = 0 ; int hi = m-1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2 ;
            if(arr[i][mid]>target) hi = mid-1 ;
            else if (arr[i][mid]<target) lo = mid+1 ;
            else return true ; 
        }
    }
    return false ;
        }
}