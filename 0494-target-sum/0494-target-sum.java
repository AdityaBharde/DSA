class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
    public int helper(int[] nums, int target,int n,int sum) {
        if(n==nums.length){
            if(sum==target)
                return 1;
            return 0;
        }
        int add=helper(nums,target,n+1,sum+nums[n]);
        int sub=helper(nums,target,n+1,sum-nums[n]);

        return add+sub;
    }
}