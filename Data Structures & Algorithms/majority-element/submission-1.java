class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int count = 0;
        int candidate= 0;

        for(int num : nums)
        {
            if(count == 0)
            {
                candidate = num;
                count = 1;
            }
            else if(candidate == num)
            {
                count++;
            }
            else if(num != candidate)
            {
                count--;
            }
        }
        return candidate;

        
        
    }
}