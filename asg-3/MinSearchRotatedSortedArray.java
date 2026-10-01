public class MinSearchRotatedSortedArray {
        public int findMin(int[] nums) {
        return helper(nums);
    }
    public int helper(int nums[]){
        int l=0, r= nums.length-1;
        while(l<r){
            int m= l+(r-l)/2;

            if(nums[m]>nums[r]) l= m+1;
            else if(nums[m]<nums[r]) r=m;

        }
        return nums[l];
    }
}



/**

0   1   2   3   4   5   6   7   8   9
4,  5,  6,  7,  8,  9,  0,  1,  2,  3
                    l   m   r       


 */