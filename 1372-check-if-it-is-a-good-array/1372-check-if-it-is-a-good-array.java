class Solution {
    public boolean isGoodArray(int[] nums) {
        int g= nums[0];
        for (int i =1 ; i< nums.length;i++){
            g=gcd(nums[i],g);
            if(g==1)
                return true;
        }
        return g==1;
    }
    public int gcd(int a , int b){
          if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }
}  