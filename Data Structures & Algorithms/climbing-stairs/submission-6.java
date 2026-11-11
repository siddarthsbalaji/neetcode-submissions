class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int i=1;
        int j=1;
        while(n>1){
            int temp=i+j;
            i=j;
            j=temp;
            n--;
        }
        return j;
    }
}
