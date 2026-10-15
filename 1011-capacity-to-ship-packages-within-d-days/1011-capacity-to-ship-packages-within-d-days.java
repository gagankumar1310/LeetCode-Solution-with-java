class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = Arrays.stream(weights).max().getAsInt() ;
        int hi = Arrays.stream(weights).sum() ;
        while(lo<=hi){
            int mid = (lo+hi)/2 ;
            int noOfDay = posDay(weights,mid);
            if(noOfDay<=days) hi = mid-1 ;
            else lo = mid+1 ; 
        }
        return lo ; 
    }
    int posDay(int[] arr , int cap){
        int day = 1; int load = 0 ;
        for(int i = 0 ; i<arr.length ;i++){
        if(arr[i]+load>cap){
            day++ ;
            load = arr[i] ;
        }
        else load+= arr[i];
        }
        return day ;
    }
}