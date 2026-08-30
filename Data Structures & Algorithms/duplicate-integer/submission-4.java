class Solution {
    public boolean hasDuplicate(int[] nums) {
        //First Approach
        // for(int i = 0 ; i<nums.length ; i++){
        //     for(int j=i+1 ; j<nums.length ; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         } 

        //     }
        //2nd Approach
        // Arrays.sort(nums);
        // for(int i = 0 ; i<nums.length-1 ; i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }

        //3rd Approach
        // Set<Integer> seenVals = new HashSet<>();
        // for(int i = 0 ; i<nums.length ; i++){
        //     if(!seenVals.contains(nums[i])){
        //     seenVals.add(nums[i]);
        //     } else{
        //         return true;
        //     }
        // }

        //4th Approach 

        Set<Integer> seenVals = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            seenVals.add(nums[i]);
        }
        if(nums.length != seenVals.size()){
            return true;
        }

    return false;
                  
    }
}                                                                              