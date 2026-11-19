class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] prefix=nums.clone();
        int[] suffix=nums.clone();
        for(int i=1;i<n;i++){
            prefix[i]*=prefix[i-1];
            suffix[n-i-1]*=suffix[n-i];
        }
        res[0]=suffix[1];
        res[n-1]=prefix[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=prefix[i-1]*suffix[i+1];
        }
        return res;
    }
}  
