class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
         List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result) {
        // If the temporary list has all numbers, add it to result
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Try each number
        for (int num : nums) {
            if (temp.contains(num)) continue;  // Avoid duplicates in same permutation

            temp.add(num);           // choose
            backtrack(nums, temp, result); // explore
            temp.remove(temp.size() - 1);   // un-choose (backtrack)
        }
    }
}