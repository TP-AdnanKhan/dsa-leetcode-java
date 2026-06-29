class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        int j = 0;

        int arr[] = new int[nums.length];

        if (nums.length == 1)
            return 1;

        arr[j++] = nums[0];

        while (r < nums.length) {
            if (nums[l] != nums[r]) {
                arr[j++] = nums[r++];
                l++;
            }
            else {
                l++;
                r++;
            }
        }

        for (int i = 0; i < arr.length; i++)
            nums[i] = arr[i];

        return j;
    }
}
