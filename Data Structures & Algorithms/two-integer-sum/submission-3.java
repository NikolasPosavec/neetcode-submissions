class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i]; 
            map.put(nums[i], i);
            
            if(map.containsKey(temp) && map.get(temp) == i) {
                map.remove(temp);
            }

            if(map.containsKey(temp)) {
                result[0] = (map.get(temp) > i) ? i : map.get(temp);
                result[1] = (map.get(temp) < i) ? i : map.get(temp);
                return result;
            }
        }
        /* i=0 temp = 5, map = 5,0
           i=1 temp = 5, map = 5,0 5,1
        */
        /*
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
        */

        return result;
    }
}