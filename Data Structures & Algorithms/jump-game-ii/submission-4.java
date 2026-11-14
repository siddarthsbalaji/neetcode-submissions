class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int c=0;
        int f=0;
        int j=0;
        for(int i=0;i<n-1;i++){
            f=Math.max(f,i+nums[i]);
            if(c==i){
                j++;
                c=f;
                if(c>n-2){
                    break;
                }
            }
        }
        return j;
    }
}
