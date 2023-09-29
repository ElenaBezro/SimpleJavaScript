// You are given a large integer represented as an integer array digits,
// where each digits[i] is the ith digit of the integer. The digits are
// ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        
        for (int i = index; i >=0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] resultArray = new int[digits.length + 1];
            resultArray[0] = 1;
            for (int i = 1; i < resultArray.length; i++) {
                resultArray[i] = digits[i - 1];
            }
            return resultArray;
        }
        return digits;
    }
}

