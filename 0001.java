class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[2] = new int[2];
        for(int i; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if( (nums[i]+nums[j]).equals(target)){
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    break;
                }
            }
            
        }
        return ans;  
    }
}