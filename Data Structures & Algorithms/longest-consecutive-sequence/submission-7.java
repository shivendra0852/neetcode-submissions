class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(!hashSet.contains(num - 1)){
                int count = 1;
                int curr = num;
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