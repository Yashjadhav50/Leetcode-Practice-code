/* Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums.*/

class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int actualSum = (range * (range + 1)/2); // formula - (n*(n+1)/2)

        int currSum = 0;

        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];
        }
        return actualSum - currSum;
    }
}