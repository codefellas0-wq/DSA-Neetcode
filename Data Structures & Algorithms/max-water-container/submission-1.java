class Solution {
    public int maxArea(int[] heights) {
        int min = 0;
        int max = 0;
        int st = 0, end = heights.length-1;
        int cal = 0;
        while(st<=end){
            min = Math.min(heights[st] , heights[end]);
            cal = min*(end-st);
            if(max<cal){
                max = cal;
            }
            if(heights[st]<heights[end]){
                st++;
            }
            else{
                end--;
            }
        }
return max;
    }
}
