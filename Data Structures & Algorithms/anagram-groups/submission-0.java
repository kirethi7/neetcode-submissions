class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
       for(int i=0;i<strs.length;i++){
        int[] charcount = new int[26];
        for(char c : strs[i].toCharArray()){
            charcount[c - 'a']++;
        }
        String key = Arrays.toString(charcount);
        result.putIfAbsent(key, new ArrayList<>());
        result.get(key).add(strs[i]);
       }
       return new ArrayList<>(result.values());
    }
}
