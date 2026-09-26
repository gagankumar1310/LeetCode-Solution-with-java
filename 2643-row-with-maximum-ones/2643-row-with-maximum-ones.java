class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
      int[] ans = new int[2] ;
      int idx = 0 ; 
      int max = 0 ; 
      for(int i=0 ;i<mat.length ;i++){
          int count = 0 ;
        for(int j=0;j<mat[0].length ;j++){
           if(mat[i][j]==1){
            count ++ ; 
           }
        }
        if(count>max){
            max = count ; 
            idx = i ; 
        }
      }  
      ans[0] = idx ; 
      ans[1] = max ;
      return ans ; 
    }
}