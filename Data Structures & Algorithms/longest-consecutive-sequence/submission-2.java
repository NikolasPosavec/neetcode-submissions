class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(!(set.contains(n))) {
                set.add(n);
            }
        }

        int longest = 1;
        for(int k : nums) {
            int temp = k;
            int curr = 1;
            boolean next = true;
            while(next) {
                if(set.contains(temp + 1)) {
                    temp++;
                    curr++;
                } else {
                    next = false;
                    longest = (curr > longest) ? curr : longest;
                }
            }
        }

        return longest;
    }
}
