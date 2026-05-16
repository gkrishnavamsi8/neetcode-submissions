
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                s.remove(nums[i]);
            } else {
                s.add(nums[i]);
            }
        }
        
        // At this point, only the single number remains in the set
        for (Integer i : s) {
            return i;
        }
        
        return -1; // fallback, though problem guarantees one single number
    }
}
