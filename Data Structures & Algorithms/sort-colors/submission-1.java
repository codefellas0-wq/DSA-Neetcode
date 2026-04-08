class Solution {
    public void sortColors(int[] nums) {
        int i = 0, l = 0, h = nums.length-1;
        while(i<=h){
            if(nums[i] == 0){
                swap(nums,l , i);
                i++;
                l++;
            }
            else if(nums[i] == 2){
                swap(nums,i , h);
                h--;
                
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr , int l , int r){
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}