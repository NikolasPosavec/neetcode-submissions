class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for(int j = 0; j < t.length(); j++) {
            if(list.contains(t.charAt(j))){
                list.remove(t.charAt(j));
            } else {
                return false;
            }
        }

        return true;
    }
}



