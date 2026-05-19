class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int start = 0;

        while (start < str.length()) {
            int end = str.indexOf('#', start);
            int len = Integer.parseInt(str.substring(start, end));
            list.add(str.substring(end + 1, end + len + 1));
            start = end + len + 1;
        }

        return list;
    }
}
