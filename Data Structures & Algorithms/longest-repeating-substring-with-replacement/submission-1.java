class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left=0, count=0,maxfreq=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq,arr[s.charAt(i)-'A']);
            System.out.println(maxfreq);
            while((i-left+1)-maxfreq > k){
                System.out.println("Inside While");
                arr[s.charAt(left)-'A']--;
                left++;
            }
            count = Math.max(count,i-left+1);
        }
        return count;
    }
}
