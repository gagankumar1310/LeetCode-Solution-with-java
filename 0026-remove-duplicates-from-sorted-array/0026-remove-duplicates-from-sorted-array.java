class Solution {
    public int removeDuplicates(int[] arr) {
    int n = arr.length ;
    if(n==0) return 0 ; 
    int k = 1 ;
    int i = 1 ;
    while(i<n){
        if(arr[i]!= arr[i-1]){
            arr[k] = arr[i] ; 
            k++ ; 
        }
        i++ ;
    }
    return k ; 
    }
}