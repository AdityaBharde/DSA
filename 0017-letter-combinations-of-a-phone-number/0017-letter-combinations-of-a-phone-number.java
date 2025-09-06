class Solution {
    public String arr[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        return helper("",digits);
    }
    public List<String> helper(String p ,String up) {
        ArrayList<String> res= new ArrayList<>();
        if(up.isEmpty()){
            res.add(p);
            return res;
        }

        int digit=up.charAt(0)-'0';
        for(int i = 0 ; i< arr[digit].length();i++){
           res.addAll(helper(p+arr[digit].charAt(i),up.substring(1)));
        }
        return res;
    }
}