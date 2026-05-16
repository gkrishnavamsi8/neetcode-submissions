class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int first = nums[i];
            int second = target - nums[i];

            // check if second element already exists
            if (map.containsKey(second)) {
               return new int[]{map.get(second), i};
            }

            // store current number with index
            map.put(first, i);
        }

        return new int[]{}; // fallback (not usually needed)
    }
}