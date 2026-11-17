class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            PQ.add(i);
        }
        while(PQ.size()>1){
            int x=PQ.poll();int y=PQ.poll();
            if(x>y){
                x-=y;PQ.add(x);
            }
        }
        if(PQ.size()==0){
            return 0;
        }
        return PQ.poll();
    }
}
