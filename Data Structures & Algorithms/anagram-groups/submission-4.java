class Solution {
    public String getkey(String s){
        int[] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append("#");
            sb.append(Integer.toString(arr[i]));
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs){
            String key=getkey(s);
            if(map.containsKey(key)){
                list=map.get(key);
                list.add(s);
                map.put(key,list);
            }
            else{
                list=new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> l:map.values()){
            res.add(l);
        }
        return res;
    }
}
