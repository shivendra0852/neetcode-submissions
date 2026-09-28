class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] arr = countFrequency(strs[i]);
            String str = Arrays.toString(arr);
            List<String> list = map.getOrDefault(str, new ArrayList<>());
            list.add(strs[i]);
            map.put(str, list);
        }

        for(List<String> stringLists : map.values()){
            ans.add(stringLists);
        }

        return ans;
    }

    public int[] countFrequency(String str){
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        return freq;
    }
}
