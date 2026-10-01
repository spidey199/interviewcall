public class PeakElement {

     public int findPeakElement(int[] nums) {
        int ans=-1, n= nums.length;
        int l=0, r= n-1;

        while(l<r){
            int m= l+(r-l)/2;

           if(nums[m]<nums[m+1])
           {
                l=m+1;
           }
           else{
            r=m;
           }

        }
        return r;


    }
    
}
