class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Set<Character> str1 = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            str1.add(s.charAt(i));
        }

        for(int i = 0; i < s.length(); i++) {
            if(!str1.contains(t.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}



