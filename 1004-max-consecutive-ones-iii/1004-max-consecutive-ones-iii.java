class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxconsec = 0, consec = 0, start = 0, end = 0, zeros = 0;

        while(end < nums.length){
            if(nums[end] == 1){
                consec++;
                end++;
            }
            else if(nums[end] == 0 && zeros < k){
                consec++;
                zeros++;
                end++;
            }
            else{
                while(zeros >= k){
                    if(nums[start] == 1){
                        start++;
                        consec--;
                    }
                    else{
                        start++;
                        consec--;
                        zeros--;
                    }
                }
            }
            if(consec > maxconsec)
                maxconsec = consec;
        }
        return maxconsec;
    }
}