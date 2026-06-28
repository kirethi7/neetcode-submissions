class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++){
            if(arr[t.charAt(j)-'a'] > 0){
                arr[t.charAt(j)-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}
