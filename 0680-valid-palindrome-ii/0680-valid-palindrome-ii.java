class Solution {
    public boolean validPalindrome(String s) {
        int st=0,count=0;
        int e=s.length()-1;
        while(st<=e){
            if(s.charAt(e)!=s.charAt(st)){
                return check(s,st+1,e) || check(s,st,e-1); 
            }else{
                 st++;
            e--;
            }
        }
        return true;
    }
    public boolean check(String s, int l, int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

}