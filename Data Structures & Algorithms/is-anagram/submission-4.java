class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        HashMap<Integer, Character> palinCheck = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            palinCheck.put(i, s.charAt(i));
        }

        for(int j = 0; j < t.length(); j++) {
            if(palinCheck.containsKey(t.charAt(j))) {
                palinCheck.remove(t.charAt(j));
            } else {
                return false;
            }
        }

        return true;
    }
}



