class Solution {
    private int maxcrossproduct(int[] nums,int low,int high){
        int mid=(low+high)/2;
        int lmax=Integer.MIN_VALUE;
        int lmin=Integer.MAX_VALUE;
        int p=1,q=1;
        for(int i=mid;i>=low;i--){
            p*=nums[i];
            q*=nums[i];
            lmax=Math.max(lmax,p);
            lmin=Math.min(lmin,p);
        }
        int rmax=Integer.MIN_VALUE;
        int rmin=Integer.MAX_VALUE;
        p=1;q=1;
        for(int i=mid+1;i<=high;i++){
            p*=nums[i];
            q*=nums[i];
            rmax=Math.max(rmax,p);
            rmin=Math.min(rmin,p);
        }
        return Math.max((lmax*rmax),(lmin*rmin));
    }
    private int maxproduct(int[] nums,int low,int high){
        if(low==high){
            return nums[low];
        }
        int mid=(low+high)/2;
        int lp=maxproduct(nums,low,mid);
        int rp=maxproduct(nums,mid+1,high);
        int cp=maxcrossproduct(nums,low,high);
        return Math.max(cp,Math.max(lp,rp));
    }
    public int maxProduct(int[] nums) {
        return maxproduct(nums,0,nums.length-1);
    }
}
