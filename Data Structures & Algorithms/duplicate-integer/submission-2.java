class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> abc=new HashSet<>();
        for(int i:nums){
            if(abc.contains(i)){
                return true;
            }
            abc.add(i);
        }
        return false;
    }
}