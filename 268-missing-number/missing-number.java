class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int exp = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        for(int i=0; i<n; i++){
            exp = exp + nums[i];
        }
        int num = sum - exp;
        return num;
    }
}