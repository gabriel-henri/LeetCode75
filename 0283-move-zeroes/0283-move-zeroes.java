class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;

        while(j < nums.length){
            if(i < nums.length && nums[i] != 0)
                i++;
            else{
                j = i+1;
                while(j < nums.length && nums[j] == 0){
                    j++;
                }
                if(j < nums.length){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}