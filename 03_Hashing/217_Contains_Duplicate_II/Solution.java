class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n= nums[i];
            if(hmap.containsKey(n)){
                return true;
            }
            else
                hmap.put(n,1);
        }
        return false;
    }
} 
