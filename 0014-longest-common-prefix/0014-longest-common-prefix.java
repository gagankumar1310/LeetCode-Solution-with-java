class Solution {
    public String longestCommonPrefix(String[] strs) {
         String target = strs[0] ; 
        for(int i = 1;i<strs.length;i++){
            String ans = "" ;
           for(int j = 0 ; j<strs[i].length()&&j<target.length();j++){
               if(target.charAt(j)== strs[i].charAt(j)){
                ans += strs[i].charAt(j) ;
               } else break ; 
            
           }
           target = ans ; 
        }
         return target  ;  
    }
}