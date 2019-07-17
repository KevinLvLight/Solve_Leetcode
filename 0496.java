class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        int[] bigger = new int[nums2.length];
        
        for(int i = 0; i < nums2.length; i++){
            
            bigger[i] = -1;
            
            for(int j = i; j < nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    bigger[i] = nums2[j];
                    break;
                }
            }
        }
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    ans[i] = bigger[j];
                }
            }
        }
        
        return ans;
            
    }
}