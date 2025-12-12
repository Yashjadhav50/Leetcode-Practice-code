/* Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans = new int[nums.length];

        int start = 0;

        int end = nums.length - 1;

        int ptr = ans.length - 1;

        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];

            if(ss>es){
                ans[ptr] = ss;
                start++ ;
            }else{
                ans[ptr] = es;
                end-- ;
            }
            ptr-- ;
        }
        return ans;
    }
}