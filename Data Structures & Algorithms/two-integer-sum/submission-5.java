class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pair = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0, j = nums.length - 1;
        while(i < j){
            int sum = pair[i][0] + pair[j][0];
            if(sum == target){
                return new int[]{Math.min(pair[i][1], pair[j][1]), Math.max(pair[i][1], pair[j][1])};
            } else if(sum < target){
                i++;
            } else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
