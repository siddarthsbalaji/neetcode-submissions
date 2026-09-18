class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder("");
        for(String i:strs){
            int n=i.length();
            String a=Integer.toString(n);
            sb.append(a);sb.append("#");sb.append(i);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;StringBuilder countstring=new StringBuilder();
        while(i<str.length()){
            while(str.charAt(i)!='#'){
                countstring.append(str.charAt(i));i++;
            }
            i++;
            int count=Integer.parseInt(countstring.toString());countstring.setLength(0);
            StringBuilder sb=new StringBuilder();
            while(count>0){
                sb.append(str.charAt(i));i++;count--;
            }
            res.add(sb.toString());
        }
        return res;
    }
}
