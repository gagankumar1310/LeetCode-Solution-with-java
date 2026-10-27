class Solution {
    public boolean rotateString(String s, String goal) {
        String check = s+s ;
        if(s.length()>goal.length()) return false ; 
        if(s.length()<goal.length()) return false ; 
         for(int i=0;i<check.length();i++){
            for(int j=i+1 ;j<check.length();j++){
               if(check.substring(i,j).equals(goal)) return true ;
            }
         }
         return false ; 
    }
}