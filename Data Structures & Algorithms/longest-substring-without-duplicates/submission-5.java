class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n < 2) {
            return n;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int max = 1;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i)) + 1, start);
            }
            max = Math.max(max, i - start + 1);
            map.put(s.charAt(i), i);
        }
        return max;
    }
}
