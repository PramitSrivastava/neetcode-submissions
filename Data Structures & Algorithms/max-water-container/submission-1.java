class Solution {
    public int maxArea(int[] heights) {
        int first = 0;
        int last = heights.length - 1;
        int ans = 0;
        while(first < last)
        {
            int length = Math.min(heights[first],heights[last]);
            int breadth = last - first;
             ans = Math.max(ans,length * breadth);

            if (heights[first] < heights[last]) {
                first++;
            } else {
                last--;
            }
            
        }
        return ans;
    }
}
