class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        int low = max;
        int high = sum;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int subarrayCount = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrayCount++;
                currentSum = num;
                if (subarrayCount > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }

        return true;
    }
}