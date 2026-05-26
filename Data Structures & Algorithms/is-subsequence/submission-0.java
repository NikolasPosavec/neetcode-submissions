class Solution {
    public boolean isSubsequence(String s, String t) {
        LinkedList<Character> list = new LinkedList<>();
        for(char ch : s.toCharArray()) {
            list.addLast(ch);
        }

        for(char th : t.toCharArray()) {
            try {
                if(th == list.getFirst()) {
                    list.removeFirst();
                }
            } catch (Exception e) {
                return true;
            }
        }

        if(list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}