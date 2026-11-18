class KthLargest {
    int k;
    PriorityQueue<Integer> PQ;
    public KthLargest(int k, int[] nums) {
        this.k=k;this.PQ = new PriorityQueue<>();
        for(int i:nums){
            add(i);
        }
    }
    public int add(int val) {
        PQ.add(val);
        if(PQ.size()>k){
            PQ.poll();
        }
        return PQ.peek();
    }
}
