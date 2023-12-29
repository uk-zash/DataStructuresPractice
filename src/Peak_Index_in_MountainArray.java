public class Peak_Index_in_MountainArray {
    public static int peak(int[] nums){
        int n = nums.length;
        int r = n-1;
        int l = 0;
        while (l<r){
            int mid =  l+ (r-l)/2;
            if (nums[mid]>nums[mid+1]&& nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1] && nums[mid]< nums[mid+1]){
                l = mid+1;
            }
            else{
                r = mid+1;
            }
        }
        return n-1;

    }
}
