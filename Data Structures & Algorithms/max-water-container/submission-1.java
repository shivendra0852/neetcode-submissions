class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int max = Integer.MIN_VALUE;
        while(i < j){
            max = Math.max(Math.min(heights[i], heights[j]) * (j - i), max);
            if(heights[i] < heights[j]){
                i++;
            } else{
                j--;
            }
        }
        return max;
    }
}
