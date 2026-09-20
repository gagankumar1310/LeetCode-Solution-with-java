class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length; 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count = 1 ; 
            for(int j=i+1;j<n;j++){
              if(arr[i]==arr[j]){
                count++ ;
              }
            }
            if(ans.contains(arr[i]))
                continue;
            if(count>n/3) ans.add(arr[i]) ;
        }
        return ans ; 
    }
}