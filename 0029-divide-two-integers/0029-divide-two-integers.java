class Solution {
    public int divide(int dividend, int divisor) {
          if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to prevent overflow, and take absolute values
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        int result = 0;

        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;

            // Double temp and multiple until temp << 1 is too large
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the largest found multiple from dividend
            ldividend -= temp;
            result += multiple;
        }

        // Apply sign
        return negative ? -result : result;
        
    }
}