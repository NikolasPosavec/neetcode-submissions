class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        
        for(int n : nums)
        {
            int counter = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(n == nums[j])
                {
                    counter++;
                }
                if(counter > 1)
                {
                    return true;
                }
            }
        }

        return false;

    }
}