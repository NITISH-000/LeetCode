class Solution {
    int x;
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                 x = i;
                 break;
            }else{
                x = nums.length;
            }
        }
        return x;
    }
}