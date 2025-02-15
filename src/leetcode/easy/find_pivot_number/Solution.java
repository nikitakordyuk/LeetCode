package leetcode.easy.find_pivot_number;

//https://leetcode.com/problems/find-pivot-index/description/
public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 0;

        int rightSum;
        int leftSum;

        for (int i = 0; i < nums.length; i++) {
            rightSum = 0;
            leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) return i;
        }

        return -1;
    }

    public int pivotIndex2(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 + nums[i] == totalSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
