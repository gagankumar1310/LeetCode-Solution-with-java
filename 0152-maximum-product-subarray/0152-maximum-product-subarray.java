class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length ; 
        int maxpro = arr[0] ; 
        for(int i=0;i<n;i++){
            int product = 1; 
            for(int j=i ;j<n ;j++){
                product *= arr[j] ;
                maxpro = Math.max(maxpro,product) ;
            }
        }
        return maxpro ;
    }
}