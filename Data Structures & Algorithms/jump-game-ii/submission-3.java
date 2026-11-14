class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] DP = new int[n];
        Arrays.fill(DP, 1001);
        DP[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= nums[i]; k++) {
                if (i + k > n - 1) {
                    return DP[n - 1];
                }
                DP[i + k] = Math.min(DP[i + k], DP[i] + 1);
            }
        }
        return DP[n - 1];
    }
}
