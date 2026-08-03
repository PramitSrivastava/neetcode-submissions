class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int product = 1;
        int zeroCount = 0;

        // Calculate the total product and count zeroes
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0;  // More than one zero, all results are zero
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? product : 0;  // Single zero
            } else {
                result[i] = product / nums[i];  // No zeroes, safe to divide
            }
        }

        return result;
    }
}
