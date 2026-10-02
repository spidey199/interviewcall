public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        int peak = findPeak(nums);
        int left = binSearch( 0, peak, nums, target );
        if(left!=-1) return left;
        return binSearch( peak+1, nums.length-1, nums, target );
    }
    int findPeak(int nums[]){
        int s=0, e=nums.length-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[m]>= nums[e])
                s= m+1;
            else
                e=m;
        }
        // if(s==0) return nums.length-1;
        return s-1;
    }

    int binSearch( int s, int e, int[] nums, int target ){
        int ans=-1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(nums[m]<target) s = m + 1;
            else if(nums[m]>target) e = m - 1;
            else {
                ans=m;
                break;
            }
        }
        return ans;
    }

}
