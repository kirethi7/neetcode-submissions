class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0,j=i, max = 0;
        Set<Character> without = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            if(!without.contains(s.charAt(j))){
                without.add(s.charAt(j));
                max = Math.max(max,j-i+1);
                j++;
            }else{
                without.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
