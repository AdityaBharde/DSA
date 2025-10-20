class Solution {
    public  int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        for(int i =0 ; i< s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(stack.isEmpty() && s.charAt(i)==')') {
                count++;
            }
            else if (s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else {
                stack.push(')');
            }
        }
        return count+stack.size();
    }
}