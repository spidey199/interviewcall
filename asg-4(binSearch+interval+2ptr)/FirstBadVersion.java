package asg-4(binSearch+interval+2ptr);

public class FirstBadVersion {
    public int firstBadVersion(int n) {

        if(n==1 && isBadVersion(n))return n;

        int l=1, r=n;
        int ans=-1;
        while(l<=r){
            int m = l+(r-l)/2;

            if(isBadVersion(m)){
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
