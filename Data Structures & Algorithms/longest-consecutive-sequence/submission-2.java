class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }

        int max = 1;
        for(Integer num : nums){
            if(!hashSet.contains(num - 1)){
                int curr = num;
                int count = 1;
                while(hashSet.contains(curr + 1)){
                    count++;
                    curr++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
