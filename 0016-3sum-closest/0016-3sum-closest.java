class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums); // Step 1: sort the array
        
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2]; // initialize with first 3 numbers
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // If the new sum is closer to target, update closest
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers based on comparison with target
                if (sum < target) {
                    left++;   // need bigger sum
                } else {
                    right--;  // need smaller sum
                }
            }
        }

        return closest;
        
    }
}