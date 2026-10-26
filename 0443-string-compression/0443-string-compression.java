class Solution {
    public int compress(char[] chars) {
        if(chars.length==1) return 1 ; 
        int i =0 ; int j = 0 ; String ans = ""; int count = 0 ; 
        while(j<chars.length){
            char ch = chars[i];
            if(chars[i]==chars[j]) j++ ;
            else {
                count = j-i ; 
                if(count==1) ans += ch;
                else {
                ans += ch ; 
                ans += count ; 
                }
                i = j ; 
            }
        }
                count = j-i ; 
                if(count==1) ans += chars[i];
                else{
                ans += chars[i] ; 
                ans += count ; 
                }
                for (int k = 0; k < ans.length(); k++) {
                  chars[k] = ans.charAt(k);
                   }

        return ans.length()  ;
    }
}