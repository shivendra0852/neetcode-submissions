class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int num : nums){
            if(hashMap.containsKey(num)){
                return true;
            } else{
                hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            }
        }
        return false;
    }
}