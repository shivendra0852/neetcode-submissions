class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            List<String> listOfString = hashMap.getOrDefault(str, new ArrayList<>());
            listOfString.add(strs[i]);
            hashMap.put(str, listOfString);
        }

        for(Map.Entry<String, List<String>> map : hashMap.entrySet()){
            ans.add(map.getValue());
        }
        return ans;
    }
}
