class Solution {
    List<List<Integer>> result=new ArrayList<>();
    private void generatesubsets(int n,int[] nums,List<Integer> current){
        if(n==nums.length){
            result.add(current);
            return;
        }
        List<Integer> temp1=new ArrayList<>(current);
        generatesubsets(n+1,nums,temp1);
        List<Integer> temp2=new ArrayList<>(current);
        temp2.add(nums[n]);
        generatesubsets(n+1,nums,temp2);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current=new ArrayList<>();
        generatesubsets(0,nums,current);
        return result;
    }
}
