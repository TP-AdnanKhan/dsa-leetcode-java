class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double wsum=0;double max;int i;
        for(i=0;i<k;i++){
            wsum += nums[i];
        }
        max=wsum;
        for(i=k;i<nums.length;i++){
            wsum+=nums[i];
            wsum-=nums[i-k];
            if(max<wsum)
                max=wsum;
        }
        max/=k;
        return max;
    }
}
