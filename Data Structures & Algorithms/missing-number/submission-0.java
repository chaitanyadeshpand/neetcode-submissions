class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedsum = n*(n+1) / 2;
        int calculatedsum = 0;
        
        for(int i:nums){
            calculatedsum += i;
        }

        return expectedsum-calculatedsum;
    }
}
