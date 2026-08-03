class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int maxans = 1;
        int curr = 1;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            if(nums[i+1] - nums[i] == 1)
            {
                curr++;
            }
            else if(nums[i+1] - nums[i] == 0)
            {
                continue;
            }
            else{
                maxans = Math.max(maxans,curr);
                curr = 1;
            }
        }
        maxans = Math.max(maxans, curr);
        return maxans;
    }
}
