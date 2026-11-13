class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int p1=0;int p2=0;
        for(int i=2;i<=cost.length;i++){
            int c=Math.min((p1+cost[i-1]),(p2+cost[i-2]));
            p2=p1;p1=c;
        }
        return p1;
    }
}
