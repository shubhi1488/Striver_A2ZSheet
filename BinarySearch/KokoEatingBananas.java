class Solution {
    private int findMax(int[] piles){
        int n=piles.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    private long helper_func(int[] piles,int hourly){
        int n=piles.length;
        long totalh=0;
        for(int i=0;i<n;i++){
            totalh+=Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=0;
        int high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            long totalh=helper_func(piles,mid);
            if(totalh<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}
