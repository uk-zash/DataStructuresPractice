public class Searching_peak_element {
    public static int peak(int[] nums){
        int l = 0;
        int r = nums.length -1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (mid==0 & mid==nums.length-1){
                return mid;
            }
            else if (mid==0 & mid!= nums.length-1){
                if (nums[mid] > nums[mid+1]){
                        return mid;
                }
                else{
                    l = mid+1;
                }
            }
            else if(mid!=0 & mid==nums.length-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                if (nums[mid]>nums[mid-1] & nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if  ( nums[mid]>nums[mid-1] & nums[mid]< nums[mid+1]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }


        }
        return nums.length-1;
    }

    public static void main(String[] args) {
        int[] n = {23,25,523,253,24};
        System.out.println(peak(n));

    }
}
