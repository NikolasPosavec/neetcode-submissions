class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // prefix product
        int pref = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = pref;
            pref = pref * nums[i];
        }
        // suffix product
        int suf = 1;
        for(int j = nums.length - 1; j > -1; j--) {
            result[j] = result[j] * suf;
            suf = suf * nums[j];
        }

        return result;
    }
}  
