class Solution {
    public List<Integer> spiralOrder(int[][] mat ) {
      List<Integer> ans = new ArrayList<>() ;
      int top = 0 ; int left = 0 ;
      int right = mat[0].length-1 ; int bot = mat.length-1 ;
      while(top<=bot && left <=right){
        for(int i = left ; i<=right ;i++){
            ans.add(mat[top][i]) ;
      }
      top ++ ;
      for(int j = top ; j<=bot ; j++){
        ans.add(mat[j][right]) ;
      }
      right -- ;
      if(top<=bot){
        for(int k = right ; k>=left ;k--){
            ans.add(mat[bot][k]);
        }
        bot -- ; 
      }
      if(left<=right){
        for(int l= bot ;l>=top ; l--){
            ans.add(mat[l][left]) ;
        }
        left ++ ; 
      } 
    }
    return ans ;
}
}