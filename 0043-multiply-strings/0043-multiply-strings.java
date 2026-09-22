class Solution {
    public String multiply(String num1, String num2) { if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        // Multiply each digit (reverse order)
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';

                int mul = d1 * d2;
                int sum = mul + result[i + j + 1];

                result[i + j] += sum / 10;       // carry
                result[i + j + 1] = sum % 10;    // digit
            }
        }

        // Convert int array to string
        StringBuilder sb = new StringBuilder();
        int i = 0;

        // Skip leading zeros
        while (i < result.length && result[i] == 0) {
            i++;
        }

        // Build final result
        while (i < result.length) {
            sb.append(result[i++]);
        }

        return sb.toString();
        
    }
}