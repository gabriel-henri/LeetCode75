class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0, end = 0, remov = 0, sub = 0, maxsub = 0;

        while(end < nums.length){
            if(nums[end] == 1){
                sub++;
                end++;
            }
            else if(nums[end] == 0 && remov < 1){
                remov++;
                end++;
            }
            else{
                while(start < end && remov > 0){
                    if(nums[start] == 1){
                        sub--;
                        start++;
                    }
                    else{
                        remov--;
                        start++;
                    }
                }
            }
            if(sub > maxsub)
                maxsub = sub;
        }
        if(remov > 0)
            return maxsub;
        else
            return maxsub-1;
    }
}