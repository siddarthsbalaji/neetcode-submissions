class Solution {
    public int getSum(int a, int b) {
        int c=0,r=0,mask=0xFFFFFFFF;
        for(int i=0;i<32;i++){
            int ax=(a>>i)&1;
            int bx=(b>>i)&1;
            int s=(ax^bx^c);
            c=((ax+bx+c)>1)?1:0;
            if(s!=0){
                r=r|(1<<i);
            }
        }
        if(r>0x7FFFFFFF){
            r=~(r^mask);
        }
        return r;
    }
}
