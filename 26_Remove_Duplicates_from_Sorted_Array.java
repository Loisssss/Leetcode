class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int totalNum = 1;
        int foundNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != foundNum) {
                foundNum = nums[i];
                nums[totalNum] = nums[i];
                totalNum++;
            }
        }
        return totalNum;
    }
}
