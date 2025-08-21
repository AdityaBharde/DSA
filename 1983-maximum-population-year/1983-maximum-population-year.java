class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];

        for (int[] log : logs) {
            year[log[0]]++;
            year[log[1]]--;
        }
        int maxPop = 0;
        int earY = 0;
        int currPop = 0;
        
        for (int i = 1950; i <= 2050;i++) {
            currPop += year[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                earY = i;
            }
        }
        
        return earY;
    }
}
