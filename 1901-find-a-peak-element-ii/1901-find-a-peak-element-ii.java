class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length ; int m = arr[0].length ;
        int lo = 0 ; int hi = m-1 ;
        while(lo<=hi){
            int mid = (lo+hi)/2 ;
            int row = FindIdx(arr,n,m,mid) ;
            int left = (mid-1>=0)?arr[row][mid-1]:-1 ;
            int right = (mid+1<m)?arr[row][mid+1] : -1 ;
            if(arr[row][mid]>left&&arr[row][mid]>right){
                return new int[] {row,mid} ;
            }
            else if (arr[row][mid]<right) lo = mid+1 ;
            else hi = mid-1 ;
        }
        return new int[]{-1,-1};
    }
    public int FindIdx(int[][]arr , int n , int m , int col){
        int idx = -1 ; int max = -1 ;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max = arr[i][col];
                idx = i ; 
            }
        }
        return idx ; 
    }
}