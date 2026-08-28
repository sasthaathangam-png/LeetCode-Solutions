class Solution {    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                result.add(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }
        return result;
    }
}