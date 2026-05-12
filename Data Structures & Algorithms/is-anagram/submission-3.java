class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        List<Character> palinChecker = new ArrayList<>();

        for(char c : s.toCharArray()) {
            palinChecker.add(c);
        }

        for(int i = 0; i < t.length(); i++) {
            if(palinChecker.contains(t.charAt(i))) {
                palinChecker.remove(t.charAt(i));
            } else {
                return false;
            }
        }

        return true;
    }
}
