class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
      int n =   arr.length ;
      int m = arr[0].length ;
      int l = 0 ; int h = m*n-1 ; int mid ;
      while(l<=h){
       mid = (h+l)/2 ;
       int r = mid/m ; int c = mid%m;
       if(arr[r][c]==target) return  true ; 
       else if(arr[r][c]<target) l = mid+1 ;
       else h =mid-1 ; 
      }
      return false ; 
       }
}