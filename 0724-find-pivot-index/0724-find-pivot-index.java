class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        for(int i = 0; i < nums.length; i++){
            int sum2 = 0;
            for(int j = nums.length - 1; j > i; j--){
                sum2 += nums[j];
            }
            if(sum1 == sum2){
                return i;
            }
            sum1 += nums[i];
            
        }
        return -1;

    }
}