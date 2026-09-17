class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length ; 
        int[] ans = new int[n] ; 
        int[] pos = new int[n/2] ;
        int[] neg = new int[n/2] ;
        int p = 0 ; int ne = 0 ; 
        for(int i = 0 ; i<n ; i++){
            if(arr[i]>0) pos[p++] = arr[i] ;
            else neg[ne++] = arr[i] ;
        }
        for(int i = 0 ; i<n ; i++){
            if(i%2==0) ans[i] = pos[i/2] ;
            else ans[i] = neg[i/2] ;
        }
         return ans ;  }
}