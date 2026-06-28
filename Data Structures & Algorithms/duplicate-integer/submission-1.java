class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int i: nums){
            if(!hashset.contains(i))
                hashset.add(i);
            else
                return true;
        }
        return false;
    }
}