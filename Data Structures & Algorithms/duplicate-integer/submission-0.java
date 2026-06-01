class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> number = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(number.containsKey(nums[i])){
                return true;
            }else
            number.put(nums[i],0);
        }
        return false;

    }
}