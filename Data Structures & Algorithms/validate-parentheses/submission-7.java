class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(char i:s.toCharArray()){
            if(map.containsKey(i)){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!=map.get(i)){
                    return false;
                }
            }
            else{
                stack.push(i);
            }
        }
        return stack.isEmpty();
    }
}
