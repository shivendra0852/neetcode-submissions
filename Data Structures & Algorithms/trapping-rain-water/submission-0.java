class Solution {
    public int trap(int[] height) {
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        prefix[0] = 0;
        for(int i = 1; i < height.length; i++){
            int value = Math.max(height[i - 1], prefix[i - 1]);
            if(value > height[i]){
                prefix[i] = value;
            } else{
                prefix[i] = 0;
            }
        }

        suffix[height.length - 1] = 0;
        for(int i = height.length - 2; i >= 0; i--){
            int value = Math.max(height[i + 1], suffix[i + 1]);
            if(value > height[i]){
                suffix[i] = value;
            } else{
                suffix[i] = 0;
            }
        }

        int ans = 0;
        for(int i = 0; i < height.length; i++){
            int value = Math.min(prefix[i], suffix[i]);
            if(value > height[i]){
                ans += value - height[i];
            }
        }
        return ans;
    }
}
