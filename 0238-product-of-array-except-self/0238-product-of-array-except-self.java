class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int product = 1;
        int zeros = 0;
        int[] ans = new int[size];

        for(int n: nums){
            if(n != 0)
                product *= n;
            else
                zeros += 1;
        }

        if(zeros > 1)
            return ans;
        else{
            for(int i = 0; i < size; i++){
                if(zeros == 0)
                    ans[i] = product/nums[i];
                else{
                    if(nums[i] == 0)
                        ans[i] = product;
                    else
                        ans[i] = 0;
                }
            }
        }
        return ans;
    }
}