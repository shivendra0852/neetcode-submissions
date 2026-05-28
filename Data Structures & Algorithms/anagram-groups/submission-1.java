class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] freq = countFrequency(strs[i]);
            String str = Arrays.toString(freq);
            List<String> list = hashMap.getOrDefault(str, new ArrayList<>());
            list.add(strs[i]);
            hashMap.put(str, list);
        }

        for(Map.Entry<String, List<String>> map : hashMap.entrySet()){
            ans.add(map.getValue());
        }

        return ans;
    }

    public int[] countFrequency(String str){
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'a']++;
        }
        return arr;
    }
}
