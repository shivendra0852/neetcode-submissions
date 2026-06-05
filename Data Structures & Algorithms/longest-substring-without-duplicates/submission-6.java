class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            if (map.containsKey(ch)) {
                i = Math.max(i, map.get(ch) + 1);
            }

            map.put(ch, j);
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}