class Solution {
    public int findMin(int[] nums) {
        boolean found = false;
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while(!found) {
            if(nums[mid] > nums[right]) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else if(nums[mid] > nums[left] || mid != 0 && nums[mid] > nums[mid - 1] ) {
                right = mid;
                mid = (left + right) / 2;
            } else {
                found = true;
            }
        }

        return nums[mid];
    }
}