class Solution {
    public int minBitFlips(int start, int goal) {
        int n= start^goal;
        int count =0;
        for(int i =1 ; i<=n; i=i<<1){
            if((n&i)!=0){
                count++;
            }
        }
        return count;
    }
}