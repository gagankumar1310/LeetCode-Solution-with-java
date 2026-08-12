class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length ; int count = 1 ; 
        Arrays.sort(arr) ;
        for (int i = 0; i<n-1 ;i++){
            if(arr[i]==arr[i+1]){
                count++ ; 
            }
            if(count>(n/2)) return arr[i+1] ;
        }
        if(n==1) return arr[0] ;
        return -1 ; 
     }
}