class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(true){
            if(n==1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int temp=n;n=0;
            while(temp>0){
                int d=temp%10;
                temp/=10;
                n+=d*d;
            }
        }
    }
}
