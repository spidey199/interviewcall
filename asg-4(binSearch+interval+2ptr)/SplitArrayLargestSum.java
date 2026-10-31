package asg-4(binSearch+interval+2ptr);

public class SplitArrayLargestSum {
    public boolean canPartition(int m,int[] nums,int k){
        int part = 1;
        int i=0;
        int curr_sum=0;
        while(i<nums.length){
            if(curr_sum+nums[i]<=m){
                curr_sum+=nums[i];
            }
            else{
                part=part+1;
                curr_sum=nums[i];
            }
            i++;
        }
        return part<=k ? true : false;
    }



    public int splitArray(int[] nums, int k) {
        int l= 0;
        int r = 0;

        for(int i=0;i<nums.length;i++){
            l= Math.max(nums[i], l);
            r+=nums[i];
        }

        int ans=-1;
        while(l<=r){
            int m =(l+r)/2;
            if(canPartition(m,nums,k)){
                ans=m;
                r=m-1;
            } 
            else{
                l=m+1;
            }
        }
        return ans;
    }
}
