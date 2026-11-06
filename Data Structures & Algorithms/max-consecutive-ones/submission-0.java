class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int total=0;
        int i=0;
        while(i< nums.length){
            if(nums[i] == 1){
                counter++;
            }
            else{
              if(total <= counter){
                total = counter;
              }  
              counter = 0;
            }
            i++;
        }
            if(total <= counter){
                total = counter;
             }  
       return total;
    }
}