class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for(String s : operations) {
            if(s.equals("+")) {
                int temp = stack.pop() + stack.pop();
                stack.push(temp);
                result += temp;
            } else if(s.equals("C")) {
                result -= stack.pop();
            } else if(s.equals("D")) {
                int temp = stack.peek() * 2;
                stack.push(temp);
                result += temp;
            } else {
                stack.push(Integer.parseInt(s));
                result += Integer.parseInt(s);
            }
        }

        return result;
    }
}