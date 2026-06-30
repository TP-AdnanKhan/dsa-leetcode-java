class Solution {
    public void sortColors(int[] nums) {
        int l=0; int p=0;int r=nums.length-1;
        while(p<=r){
            if(nums[p]==0){
                int t=nums[l];
                nums[l]=nums[p];
                nums[p]=t;
                l++;p++;
            }
            else if(nums[p]==1)
                p++;
            else{
                int t=nums[r];
                nums[r]=nums[p];
                nums[p]=t;
                --r;
            }
        }
    }
}
