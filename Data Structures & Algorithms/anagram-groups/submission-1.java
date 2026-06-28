class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int arr[] = new int[26];
            String word = strs[i];
            for(char a: word.toCharArray())
                arr[a -'a']++;
            String key = Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
