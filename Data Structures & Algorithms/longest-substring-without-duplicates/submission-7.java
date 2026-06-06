class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();
        int max = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            while(hashSet.contains(s.charAt(j))){
                hashSet.remove(s.charAt(i++));
            }
            max = Math.max(max, j - i + 1);
            hashSet.add(s.charAt(j));
        }

        return max;
    }
}