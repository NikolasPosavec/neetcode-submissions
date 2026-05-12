class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for(int j = 0; j < t.length(); j++) {
            if(!stack.contains(t.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
