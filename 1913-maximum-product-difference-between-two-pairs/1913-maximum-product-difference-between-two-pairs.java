class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums) ;
     int w = 0 ; int x = 1 ; int y = nums.length-2 ; int z = nums.length-1 ;
    int  diff = ((nums[y]*nums[z])-(nums[w]*nums[x])) ;  
     return diff ; 
     
    }
}