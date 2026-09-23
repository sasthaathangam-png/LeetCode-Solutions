class Solution {
    public int[][] merge(int[][] intervals){
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Traverse and merge
        for (int[] interval : intervals) {
            // If list is empty or no overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Merge with the last interval
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        // Convert list back to array
        return result.toArray(new int[result.size()][]);
       
    }
}