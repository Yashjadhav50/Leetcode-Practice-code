/* Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
A subarray is defined as a contiguous sequence of numbers in an array.

Example 1:
Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.

Example 2:
Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.

Example 3:
Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.*/

class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int max = nums[0];
        int currMax = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i-1] < nums[i]){
                currMax = currMax + nums[i];
            }else{
                max = Math.max(max, currMax);
                currMax = nums[i];
            }
        } 
        max = Math.max(max, currMax);
        return max;
    }
}