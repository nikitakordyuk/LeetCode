package leetcode.easy.contains_duplicate;

import java.util.HashSet;

//https://leetcode.com/problems/contains-duplicate/description/
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        final HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
