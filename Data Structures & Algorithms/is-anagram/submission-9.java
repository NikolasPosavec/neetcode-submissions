class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        Map<Integer, Character> sMap = new HashMap<>();
        
        boolean checked = false;
        int i = 0;
        int j = 0;

        while(!checked) {
            if(i < s.length()) {
                sMap.put(i, s.charAt(i));
                i++;
            } else if(j < s.length() && sMap.containsValue(t.charAt(j))) {
                sMap.values().remove(t.charAt(j));
                j++;
            } else {
                checked = true;
            }
        }
        return sMap.size() == 0;
    }
}



