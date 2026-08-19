class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        int size = nums.length;
        for(int i = 0 ; i<size ; i++){
            for(int j = i+1 ; j<size ; j++){
            if(nums[i]==nums[j]){
                flag = true;
            }
        }
        }
        return flag ; 
    }
}