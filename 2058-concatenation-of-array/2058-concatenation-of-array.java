class Solution {
    public int[] getConcatenation(int[] nums) {
        int num[]=new int[nums.length*2];
        for(int i=0;i<num.length;i++){
            num[i]=nums[i%nums.length];
        }
        return num;
    }
}