class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i:nums)
            hashmap.put(i, hashmap.getOrDefault(i,0)+1);
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0;i<bucket.length;i++)
            bucket[i] = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : hashmap.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int result[] = new int[k];
        int index = 0;
        for(int i=bucket.length-1;i>=0 && index < k ;i--){
            for(int j: bucket[i]){
                if(index < k) result[index++] = j;
                if(index == k) return result;
            }
        }
        return result;


    }

}
