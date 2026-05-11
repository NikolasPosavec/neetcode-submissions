class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i]; 
            
            if(map.containsKey(temp)) {
                result[0] = (map.get(temp) > i) ? i : map.get(temp);
                result[1] = (map.get(temp) < i) ? i : map.get(temp);
                return result;
            }

            map.put(nums[i], i);
        }
        return result;
    }
}