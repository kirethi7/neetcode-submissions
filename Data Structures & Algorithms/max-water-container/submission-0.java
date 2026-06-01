class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            if(heights[i]<heights[j]){
                max = Math.max(max,heights[i]*(j-i));
                i++;
                System.out.println(max);
            }else{
                max = Math.max(max,heights[j]*(j-i));
                j--;
            }
        }
        return max;
    }
}
