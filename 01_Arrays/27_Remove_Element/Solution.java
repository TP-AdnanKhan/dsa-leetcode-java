int removeElement(int* nums, int numsSize, int val) {
    if (numsSize < 1)
        return 0;
    int nums1[numsSize];
    int k = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != val) {
            nums1[k] = nums[i];
            k++;
        }
    }
    for (int i = 0; i < k; i++) {
        nums[i] = nums1[i];
    }
    return k;
}
