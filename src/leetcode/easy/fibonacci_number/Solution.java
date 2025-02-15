package leetcode.easy.fibonacci_number;

//https://leetcode.com/problems/fibonacci-number/description/
public class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        if (n < 0 || n > 45) {
            return -1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
