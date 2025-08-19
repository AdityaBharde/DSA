class Solution {
    public int[] numberGame(int[] nums) {
        
       int n=nums.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        for(int i=0,j=1;i<n-1&&j<n;i+=2,j+=2){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}