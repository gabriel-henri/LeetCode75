import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int output = 0;

        while(i < j){
            if(nums[i] + nums[j] == k){
                output++;
                i++;
                j--;
            }
            else{
                if((nums[i]+nums[j]) > k)
                    j--;
                else
                    i++;
            }
        }
        return output;
    }
}