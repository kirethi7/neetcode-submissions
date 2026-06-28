class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(target-nums[i])){
                arr[0] = hashmap.get(target-nums[i]);
                arr[1] = i;
            }else{
                hashmap.put(nums[i],i);
            }
        }
        return arr;
    }
}
