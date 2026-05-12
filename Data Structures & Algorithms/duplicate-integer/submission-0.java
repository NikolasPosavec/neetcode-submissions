class Solution {
    public boolean hasDuplicate(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for(int n : nums) {
            if(!stack.contains(n)) {
                stack.push(n);
            } else {
                return false;
            }
        }

        return true;
    }
}