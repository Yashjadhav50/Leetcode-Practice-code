

class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(mid!=0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }else if(nums[mid]>nums[mid+1] && mid!=nums.length-1){
                return nums[mid+1];
            }else if(nums[start]<=nums[mid]){ //first part is sorted.
                start = mid+1;
            }else{//second part is sorted.
                end = mid-1;
            }
        }
        return -1;
    }
}