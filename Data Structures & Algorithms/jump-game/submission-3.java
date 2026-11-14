class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n<2){
            return true;
        }
        int[] canreach=new int[n];
        canreach[n-1]=1;
        for(int i=n-2;i>-1;i--){
            for(int j=i+1;j<n;j++){
                if(nums[i]>=(j-i)){
                    if(canreach[j]==1){
                        canreach[i]=1;break;
                    }
                }
            }
        }
        return (canreach[0]==1);
    }
}
