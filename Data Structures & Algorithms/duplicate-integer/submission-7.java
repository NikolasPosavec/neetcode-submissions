class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int i : nums) {
            if(seen.contains(i)) {
                return true;
            } else {
                seen.add(i);
            }
        }

        return false;
    }
}

// init set for #'s that have been seen
// loop thru nums array
    // check if current num is in seen set
        // if is
            // return true
        // else 
            // add num to seen
// return false