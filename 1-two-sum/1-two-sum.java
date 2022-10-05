class Solution {
    
 
    int[] pass = new int[]{0,0}; 
    
    
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i<nums.length; i++){
          for(int j = i + 1; j<nums.length; j++){ 
            if( nums[i] + nums[j] == target){
                pass[0] = i;
                pass[1] = j;
                return pass;
               
            }
          }
        }
        
        return null;
    }
}