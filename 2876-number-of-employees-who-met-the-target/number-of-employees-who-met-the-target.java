class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = 0;
        for(int num : hours){
            if(num>=target){
                n++;
            }
        }
        return n;
    }
}