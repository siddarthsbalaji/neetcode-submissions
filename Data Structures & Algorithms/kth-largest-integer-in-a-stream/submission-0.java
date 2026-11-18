class KthLargest {
    int K;
    List<Integer> list=new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i:nums){
            list.add(i);
        }
    }
    
    public int add(int val) {
        list.add(val);Collections.sort(list);
        return list.get(list.size()-K);
    }
}
