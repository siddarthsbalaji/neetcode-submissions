class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length();
        int M = text2.length();
        int[][] DP = new int[N+1][M+1];
        for(int i=1;i<N+1;i++){
            for(int j=1;j<M+1;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    DP[i][j]=DP[i-1][j-1]+1;
                }
                else{
                    DP[i][j]=Math.max(DP[i-1][j],DP[i][j-1]);
                }
            }
        }
        return DP[N][M];
    }
}
