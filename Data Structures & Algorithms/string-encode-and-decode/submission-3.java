class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            int l=s.length();
            sb.append("#"+l+"#"+s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        int n=str.length();
        int i=0;
        while(i<n){
            if(str.charAt(i)=='#'){
                i++;
                StringBuilder sb=new StringBuilder();
                while(str.charAt(i)!='#'){
                    sb.append(str.charAt(i++));
                }
                i++;
                int l=Integer.parseInt(sb.toString());
                StringBuilder word=new StringBuilder();
                while(l>0 && i<n){
                    word.append(str.charAt(i++));l--;
                }
                list.add(word.toString());
            }
        }
        return list;
    }
}
