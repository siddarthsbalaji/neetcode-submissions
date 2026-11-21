class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int n = str.length();
        int i = 0;
        while (i < n) {
            int len = Integer.parseInt(str.substring(i, str.indexOf("#", i)));
            i = str.indexOf("#", i) + 1;
            list.add(str.substring(i, i + len));
            i += len;
        }
        return list;
    }
}
