class Solution {
    public boolean rotateString(String s, String goal) {
        String check = s+s ;
        if(s.length()>goal.length()) return false ; 
        if(s.length()<goal.length()) return false ; 
        if(check.contains(goal)) return true ; 
         return false ; 
    }
}