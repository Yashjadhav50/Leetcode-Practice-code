/* The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int p = num.length - 1;

        int carry = 0;

        while(p>=0 || k>0){
            int numval = 0;

            if(p>=0){
                numval = num[p];
            }
            
            int d = k%10; //it is last digit of k

            int sum = numval + d + carry;

            int digit = sum % 10;
            
            carry = sum/10;

            ans.add(digit);

            p--; //moving pointer
            k = k/10; //removing last digit from k
        }
        if(carry > 0){
            ans.add(carry); //adding carry to list
        }

        Collections.reverse(ans); //reversing the list

        return ans;
    }
}