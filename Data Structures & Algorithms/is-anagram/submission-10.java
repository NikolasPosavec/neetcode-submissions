class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];

        for(int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a'] += 1;
        }

        for(int j = 0; j < t.length(); j++) {
            counts[t.charAt(j) - 'a'] -= 1;
            if(counts[t.charAt(j) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}



