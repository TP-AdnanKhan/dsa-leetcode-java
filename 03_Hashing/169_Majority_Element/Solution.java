class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int len = nums.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            if (hmap.containsKey(n))
                hmap.put(n, hmap.get(n) + 1);
            else
                hmap.put(n, 1);
        }
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            if (hmap.get(n) > (len / 2))
                ans = n;
        }
        return ans;
    }
}
