class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize the lower and upper bounds of the search range
        int low = 0;
        int high = nums.length -1;
        // Initialize the pointer to the middle of the search range
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