class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int longestStreak = 0;
        int tempStreak = 0;

        for(int n : nums) {
            if(n == 1) {
                tempStreak++;
            } else {
                longestStreak = (longestStreak > tempStreak) ? 
                                    longestStreak : tempStreak;
                tempStreak = 0;
            }
        }

        return (longestStreak > tempStreak) ? longestStreak : tempStreak;
    }
}