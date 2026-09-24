class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, it becomes 0 after adding 1
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 -> 1000)
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
        
    }
}