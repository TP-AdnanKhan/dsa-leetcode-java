class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;int r;int sum=0;
        int  min=nums.length+1,len=0;
        for(r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                len=r-l+1;
                if(len<min)
                    min=len;
                sum-=nums[l++];
            }
        }
        if(min>nums.length)
            return 0;
        return min;
    }
}
