class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Integer, Character> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sMap.put(i, s.charAt(i));
        }

        for(int j = 0; j < s.length(); j++) {
            if(sMap.containsValue(t.charAt(j))) {
                sMap.values().remove(t.charAt(j));
            }
        }

        return sMap.size() == 0;
    }
}



