class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> firstString = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(firstString.containsKey(s.charAt(i))){
                firstString.put(s.charAt(i), firstString.getOrDefault(s.charAt(i), 0) + 1);
            }else{
                firstString.put(s.charAt(i),1);
            }
        }
        int tstring = 0;
        for(int j=0;j<t.length();j++){
            Character key = t.charAt(j);
            if(firstString.containsKey(key)){
                int value = firstString.get(key);
                if(value > 0) {
                    tstring++;    
                    firstString.put(key, firstString.getOrDefault(key, 0) - 1);
                } if(firstString.get(key) == 0)
                    firstString.remove(key);
            }else
                return false;
        }


        if(firstString.size() == 0 && tstring == t.length())
         return true;
        else
         return false;
    }         
}
