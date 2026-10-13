class Solution {
    public int[] productExceptSelf(int[] nums) {
        // make an empty list equal to nums size
        int[] result = new int[nums.length];

        // populate with 1s instead of 0s
        for (int i = 0; i < nums.length; i++) {
            result[i] = 1;
        }

        // prefix array
        int left = 1;
        for (int j = 0; j < nums.length; j++) {
            result[j] *= left;
            left *= nums[j];
        }

        // suffix array
        int right = 1;
        for (int k = nums.length - 1; k >= 0; k--) {
            result[k] *= right;
            right *= nums[k];
        }
        
        return result;
    }
}  
