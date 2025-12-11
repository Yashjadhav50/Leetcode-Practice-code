/* Given the array of integers nums, you will choose two different indices i and j of that array.
 Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value,
 that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.*/
 
class Solution {
    public int maxProduct(int[] nums) {
        int smax = -1;
        int max = -1;

        for(int i=0;i<nums.length;i++){

            if(max < nums[i]){
                smax = max;
                max = nums[i];
            }else if(smax < nums[i]){
                smax = nums[i];
            }
        }
        int add = (max - 1) * (smax - 1);
        
        return add;
    }
}
