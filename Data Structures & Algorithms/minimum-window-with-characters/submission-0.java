class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        int i=0,j=0,count=0;
        int startindex=0;
        int minlength = Integer.MAX_VALUE;
        while(j<s.length()){
            if (tMap.containsKey(s.charAt(j))&& tMap.get(s.charAt(j)) > 0) {
                count++;
            }
            tMap.put(s.charAt(j), tMap.getOrDefault(s.charAt(j),0)-1);
            while(count == t.length()){
                 if (j - i + 1 < minlength) {
                    minlength = j - i + 1;
                    startindex = i;
                }
                tMap.put(s.charAt(i),tMap.getOrDefault(s.charAt(i),0)+1);
                if(tMap.get(s.charAt(i))>0){
                    count--;
                } 
                i++;
            }
            j++;
            System.out.println(i +"-- "+ j);
        }
        return minlength == Integer.MAX_VALUE ? "" : s.substring(startindex, startindex+minlength);
    }
}
