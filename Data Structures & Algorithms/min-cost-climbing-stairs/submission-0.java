class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;int[] DP=new int[n+1];
        DP[0]=0;DP[1]=0;
        for(int i=2;i<=n;i++){
            DP[i]=Math.min((DP[i-1]+cost[i-1]),(DP[i-2]+cost[i-2]));
        }
        return DP[n];
    }
}
