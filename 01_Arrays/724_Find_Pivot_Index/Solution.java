class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;int flag=0;
        for(i=0;i<nums.length;i++){
            int left=0;int right=0;
            if(i!=0)
                for(int j=0;j<i;j++)
                    left+=nums[j];
            if(i!=nums.length-1)
                for(int j=i+1;j<nums.length;j++)
                    right += nums[j];
            if(left==right){
                flag++;
                break;
            }
        }
        if(flag==1)
            return i;
        return -1;
    }
}
