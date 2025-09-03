class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;

        }
    public int search(int nums[],int target,boolean findstart ){
        int ans=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if (target>nums[mid]){
                s=mid+1;
                }
            else if(target<nums[mid]){
                e=mid-1;
                }
            else{
                ans=mid;
                if(findstart){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            }
          return ans;
    }
         
    }
