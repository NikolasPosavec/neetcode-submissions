class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for(int i = 0; i < k; i++) {
            int temp = 0;
            int rem = -1;
            for(int t : map.keySet()) {
                if(map.get(t) > temp) {
                    temp = t;
                    rem = t;
                }
            }
            result[i] = temp;
            map.remove(rem);
        }

        return result;
    }
}
