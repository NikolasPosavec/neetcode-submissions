class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for(int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if(map.containsKey(temp)) {
                if(map.get(temp) > j) {
                    result[0] = j;
                    result[1] = map.get(temp);
                } else if(map.get(temp) == j) {
                    map.remove(temp);
                    if(map.containsKey(temp)) {
                        if(map.get(temp) > j) {
                            result[0] = j;
                            result[1] = map.get(temp);
                        } else {
                            result[0] = map.get(temp);
                            result[1] = j;
                        }
                    }
                } else {
                    result[0] = map.get(temp);
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
// 3,0 4,1 5,2 6,3
// j = 0 temp = 5 if(contains(5)) -> 0 = 0, 1 = 0