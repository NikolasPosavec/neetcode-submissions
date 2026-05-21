class Solution {
    public boolean isPalindrome(String s) {
        String filtered = "";
        for(char ch : s.toLowerCase().toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                filtered += ch;
            } else if(ch >= 'A' && ch <= 'Z') {
                filtered += ch;
            } else if(ch >= '0' && ch <= '9') {
                filtered += ch;
            }
        }
        int j = filtered.length() - 1;
        for(int i = 0; i < filtered.length(); i++) {
            if(filtered.charAt(i) != filtered.charAt(j)) {
                return false;
            }
            j--;
        }

        return true;
    }
}
