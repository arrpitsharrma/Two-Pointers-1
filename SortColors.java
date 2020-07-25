class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while(low<=mid && mid<=high){
           if(nums[mid]==0){
               swap(nums, low, mid);
               low++;
               mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}