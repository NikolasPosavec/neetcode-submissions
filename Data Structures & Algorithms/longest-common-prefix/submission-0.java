class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        for(int i = 0; i < strs[0].length(); i++) {
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

