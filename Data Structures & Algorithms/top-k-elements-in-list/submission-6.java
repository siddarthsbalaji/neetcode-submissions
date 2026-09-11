class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> abc=new HashMap<>();
        for(int i:nums){
            abc.put(i,abc.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets=new List[1+nums.length];
        for(int i:abc.keySet()){
            int f=abc.get(i);
            if(buckets[f]==null){
                buckets[f]=new ArrayList<>();
            }
            buckets[f].add(i);
        }
        int index=0;int[] res=new int[k];
        for(int i=buckets.length-1;i>=0 && index<k;i--){
            if(buckets[i]==null){
                continue;
            }
            for(int j=0;j<buckets[i].size();j++){
                if(index==k){
                    return res;
                }
                res[index++]=buckets[i].get(j);
            }
        }
        return res;
    }
}
