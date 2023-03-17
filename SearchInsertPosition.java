class Solution {
    public int searchInsert(int[] nums, int target) {
        // Initialize the lower and upper bounds of the search range
        int low = 0;
        int high = nums.length -1;
        // Initialize the pointer to the middle of the search range
        int pointer = high / 2;

        // Perform a binary search for the target value
        while (low <= high){
             // If the current pointer value is equal to the target, return the pointer index
            if (nums[pointer] == target) {
                return pointer;
            }  else if(target > nums[pointer]){// If the target is greater than the current pointer value
                low = pointer +1;
            }
        }
        return 1;
    }
}