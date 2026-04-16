class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int st = 0, right = numbers.length-1;
        while(st<=right){
            if((numbers[st]+numbers[right]) > target){
                right--;
            }
            else if((numbers[st]+numbers[right]) < target){
st++;
            }
            else if((numbers[st]+numbers[right]) == target){
              ans[0] =  st+1;
              ans[1] = right+1;
              break; 
            }
        }
        return ans;
    }
}
