class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }
            int length=1;
            while(set.contains(i+length)){
                length++;
            }
            longest=Math.max(longest,length);
        }
        return longest;
    }
}
