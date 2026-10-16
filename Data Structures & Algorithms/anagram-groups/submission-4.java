class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] arr = countFrequency(strs[i]);
            String key = Arrays.toString(arr);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }

    public int[] countFrequency(String str){
        int[] ans = new int[26];
        for(int i = 0; i < str.length(); i++){
            ans[str.charAt(i) - 'a']++;
        }
        return ans;
    }
}
