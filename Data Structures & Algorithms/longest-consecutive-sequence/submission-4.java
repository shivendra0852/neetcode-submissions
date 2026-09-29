class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }

        int max = 1;
        for(Integer num : nums){
            if(!hashSet.contains(num - 1)){
                int current = num;
                int count = 1;
                while(hashSet.contains(current + 1)){
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
