class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer, Integer> hashMap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hashMap.get(a) - hashMap.get(b));
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        
        for(int num : hashMap.keySet()){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int idx = 0;
        while(!pq.isEmpty()){
            arr[idx++] = pq.poll();
        }
        return arr;
    }
}
