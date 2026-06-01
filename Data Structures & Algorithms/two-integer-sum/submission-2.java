class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> arraynum = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(arraynum.containsKey(target-nums[i])){
                result[1] = i;
                System.out.println(target-nums[i]);
                result[0] = arraynum.get(target-nums[i]);
            }else{
                arraynum.put(nums[i], i);
            }
        }
     return result;
    }
}
