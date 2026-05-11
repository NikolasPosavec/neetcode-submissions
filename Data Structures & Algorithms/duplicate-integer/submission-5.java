class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        Set<Integer> seenNums = new HashSet<>();
    
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                seenNums.add(nums[i]);
            } else if(seenNums.contains(nums[i])) {
                return true;
            } else {
                seenNums.add(nums[i]);
            }
        }

        return false;
    }
}