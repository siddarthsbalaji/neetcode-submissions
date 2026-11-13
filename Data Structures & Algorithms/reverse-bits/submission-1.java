class Solution {
    public int reverseBits(int n) {
        int res=n&1;n=n>>1;
        for(int i=0;i<31;i++){
            res=res<<1;
            if((n & 1)==1){
                res=res|1;
            }
            n=n>>1;
        }
        return res;
    }
}
