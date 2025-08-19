class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> viewedNums= new HashMap<>();
        int countOfGoodPairs = 0;
        for (int i = 0; i < nums.length; i++){
            int currentCount = viewedNums.getOrDefault(nums[i], 0);
            countOfGoodPairs += currentCount;
            viewedNums.put(nums[i], currentCount + 1);
        }
        return countOfGoodPairs;
    }
}