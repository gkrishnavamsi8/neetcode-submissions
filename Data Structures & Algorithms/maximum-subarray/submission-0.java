class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSoFar = Math.max(maxSoFar, currentSum);

            if (currentSum < 0) {
                currentSum = 0; 
            }
        }

        return maxSoFar;
    }
}
