class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length; 
        Arrays.sort(arr) ;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;){ 
            int count = 1 ; 
             while(i+1<n && arr[i]==arr[i+1]){
                count++ ;
                i++ ; 
             }
            if(count>n/3) {
                ans.add(arr[i]) ;
            }
            i++ ; 
        }
        return ans ; 
    }
}