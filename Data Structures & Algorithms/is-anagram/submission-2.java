class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        List<Character> palinChecker = new ArrayList<>();

        for(char c : s.toCharArray()) {
            palinChecker.add(c);
        }

        for(char c : t.toCharArray()) {
            if(palinChecker.contains(c)) {
                palinChecker.remove(c);
            } else {
                return false;
            }
        }

        return true;
    }
}
