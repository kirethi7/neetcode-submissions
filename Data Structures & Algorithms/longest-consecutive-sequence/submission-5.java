class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int n=0;n<nums.length;n++){
                set.add(nums[n]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int i=0,length=0;
        int max = 0;
        System.out.println(list);
        while(i<list.size()){
            if(!list.contains(list.get(i)-1))
                length = 1;
              while(i <list.size() && list.contains(list.get(i)+1)){
                System.out.println(list.get(i));
                length++;
                i++;
              }
              max = Math.max(max,length);
            i++;
        }
        
        return max;
    }
}
