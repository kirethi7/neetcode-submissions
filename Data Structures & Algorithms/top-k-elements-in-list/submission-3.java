class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(countMap.containsKey(nums[i]))
                countMap.put(nums[i], countMap.getOrDefault(nums[i], 0)+1);
            else
                countMap.put(nums[i], 1);
        }
       
       int n = nums.length;
        List<Integer>[] freq = new List[n+1];
    
       for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
                freq[entry.getValue()].add(entry.getKey());
        }

        int result[] = new int[k];int index = 0;
        for(int i=freq.length-1;i>=1 && index < k;i--){
                for (int j : freq[i]) {
                result[index++] = j;
                if (index == k) {
                    return result;
                }}
        }
        return result;
    }
}
