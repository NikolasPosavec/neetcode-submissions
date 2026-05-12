class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int node = nums[i];
            for(int n : nums) {
                if(n == node) {
                    return true;
                }
            }
        }

        return false;
    }
}