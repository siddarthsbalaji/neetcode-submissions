class Solution {
    List<List<Integer>> result = new ArrayList<>();
    private void generatesubsets(int n, int[] nums, List<Integer> current) {
        if (n == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        generatesubsets(n + 1, nums, current);
        current.add(nums[n]);
        generatesubsets(n + 1, nums, current);
        current.remove(current.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        generatesubsets(0, nums, current);
        return result;
    }
}
