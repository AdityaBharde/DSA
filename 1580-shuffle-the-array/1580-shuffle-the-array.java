class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int [2*n];
        int j=0,k=n;
        for(int i =1;i<nums.length;i+=2){
            arr[i-1]=nums[j];
            arr[i]=nums[k];
            j++;
            k++;
        }
        return arr;
    }
}