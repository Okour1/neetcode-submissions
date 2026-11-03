class Solution {
    public boolean hasDuplicate(int[] nums) {
         int i=0;
        while(i < nums.length){
            for (int j = i+1 ;j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}