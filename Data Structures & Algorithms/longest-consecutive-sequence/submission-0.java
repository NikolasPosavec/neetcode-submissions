class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // map: 2,0 20,1 4,2 10,3 3,4 4,5 5,6
        // curr = 2; if contains(2+1) ? true curr = 3; remove 2 streak++
        // curr = 3; if contains(3+1) ? true curr = 4; remove 3 streak++
        // curr = 4; if contains(4+1) ? true curr = 5; remove 4 streak++
        // curr = 5; if contains(5+1) ? true curr = 6; remove 5 streak++
        // curr = 6; if contains(6+1) ? false curr = -1; remove 6 
        // map: 20,1 10,3
        int highestStreak = 1;

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
