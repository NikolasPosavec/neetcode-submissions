class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int shortestLength = strs[0].length();

        for(String s : strs) {
            if(s.length() == 0) {
                return result;
            }
            shortestLength = (s.length() < shortestLength) ? s.length() : shortestLength;
        }


        for(int i = 0; i < shortestLength; i++) {
            String temp = result + strs[0].charAt(i);
            for(String s : strs) {
                if(!(s.substring(0, i + 1).equals(temp))) {
                    return result;
                }
            }
            result = temp;
        }

        return result;
    }
}

