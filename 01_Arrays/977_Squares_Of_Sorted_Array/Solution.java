class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int arr[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                arr[nums.length-i-1]=nums[left]*nums[left];
                left++;
            }
            else{
                arr[nums.length-i-1]=nums[right]*nums[right];
            right--;    
            }
            i++;
        }
        return arr;
    }
}
