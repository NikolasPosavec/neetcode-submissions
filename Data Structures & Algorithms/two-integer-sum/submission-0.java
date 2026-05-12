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
                result[0] = (map.get(temp) > j) ? j : map.get(temp);
                result[1] = (map.get(temp) < j) ? j : map.get(temp);
            }
        }

        return result;
    }
}
// 3,0 4,1 5,2 6,3
//