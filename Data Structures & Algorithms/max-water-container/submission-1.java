class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i = 0;
        int j=n-1;
        int max=Math.min(heights[0],heights[1]);
        while(i<j){
            int area = Math.min(heights[i],heights[j])*(j-i);
            max=Math.max(area,max);
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
