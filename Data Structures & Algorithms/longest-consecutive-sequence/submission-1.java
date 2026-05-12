class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int highestStreak = 0;

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int curr = -1;
        int streak = 0;
        for(int j = 0; j < nums.length; j++) {
            if(curr == -1) {
                curr = nums[j];
                streak++;
            }

            if(map.containsKey(curr + 1)) {
                map.remove(curr);
                curr = curr + 1;
                streak++;
            } else {
                map.remove(curr);
                curr = -1;
                highestStreak = (streak > highestStreak) ? streak : highestStreak;
                streak = 0;
            }
        }

        return highestStreak;
    }
}
