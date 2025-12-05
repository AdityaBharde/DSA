class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String result = "";
        while(i<word1.length() && i<word2.length()){
            result+=word1.charAt(i);
            result+=word2.charAt(i);
            i++;
        }
         if (i < word1.length()) {
            result += word1.substring(i);
        }
        if (i < word2.length()) {
            result += word2.substring(i);
        }

        return result;
    }
}