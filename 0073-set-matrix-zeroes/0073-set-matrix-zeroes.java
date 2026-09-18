class Solution {
    public void setZeroes(int[][] mat) {
        int m = mat.length ; int n = mat[0].length ;  
        int[][] zero = new int[m][n] ; 
        for(int i = 0 ;i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(mat[i][j]==0){
                    zero[i][j]= 1 ; 
                    }
            }
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(zero[i][j]==1){
                    for(int x=0 ;x<n;x++){
                        mat[i][x]= 0 ;
                    }
                    for(int y =0 ; y<m ; y++){
                        mat[y][j]= 0 ; 
                    }
                }
            }
        }
    }
}