class Solution {
    public int singleNumber(int[] nums) {
       HashMap <Integer,Integer> hmap = new HashMap <>();
       for(int i=0;i<nums.length;i++){
        if(hmap.containsKey(nums[i]))
            hmap.put(nums[i],2);
        else
            hmap.put(nums[i],1);
       } 
       for(int i=0;i<nums.length;i++){
        if(hmap.get(nums[i])==1)
            return nums[i];
       }
       return -1;
    }
}
