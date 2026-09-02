class Solution {
    public long subArrayRanges(int[] nums) {
        long totalsum=0;
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<nums.length;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);

                totalsum += (max-min);
            }
        }
        return totalsum;
        
    }
}