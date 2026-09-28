class Solution {
    public List<Integer> getRow(int row) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<=row ;i++){
        arr.add(new ArrayList<Integer>()) ;
        for(int j=0 ;j<=i;j++){
            if(j==0 || j==i){
                arr.get(i).add(1);
            }
            else {
                int value = arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                arr.get(i).add(value);
            }
        }
    }
        for(int i =0 ;i<arr.get(row).size();i++){
            ans.add(arr.get(row).get(i)) ;
        }
        return ans ;
    }
}