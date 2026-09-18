class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length ;  
        int m = arr[0].length ;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;           
            }
        }
        // reverse row 
        for(int i = 0 ; i<n ; i++){
            int s = 0 ; int e = m-1 ;
            while(s<e){
                int temp = arr[i][s] ;
                arr[i][s] = arr[i][e] ;
                arr[i][e] = temp ;
                s++ ;
                e-- ;
            }
        }
    }
}