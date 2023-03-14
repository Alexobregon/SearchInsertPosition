class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int pointer = high / 2;
        while (low <= high){
            if (nums[pointer] == target) {
                return pointer;
            }  else if(target > nums[pointer]){
                low = pointer +1;
            }
        }
        return 1;
    }
}