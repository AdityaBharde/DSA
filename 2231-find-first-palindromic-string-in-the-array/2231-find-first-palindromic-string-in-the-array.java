class Solution {
    public String firstPalindrome(String[] words) {
        for(String a : words){
            if(a.equals(reverse(a))){
                return a;
            }
        }
        return "";
    }
    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}