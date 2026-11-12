class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while ((i > -1) && (digits[i] == 9)) {
            digits[i] = 0;
            i--;
        }
        if (i != -1) {
            digits[i]++;
            return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;
    }
}
