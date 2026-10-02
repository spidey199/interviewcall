public class AllocateMinimumPages {
    
 
    public int findPages(int[] arr, int k) {
        // code here
        if(k > arr.length)
            return -1;
        long r = 0;
        long l = 0;

        for(long i : arr) {
            r += i;
            l = Math.max(l, i);
        }
        long ans=-1;
        
        while(l<=r){
            long m=(l+r)/2;
            
            if(can_allocate(arr,k, m)){
                ans=m;
                r=m-1;
            }
            else l=m+1;
            
        }
        return (int)ans;
    }
    
    
    
    public boolean can_allocate(int arr[], int k, long m){
        k=k-1;
        long s=0;
        for(int i=0;i<arr.length;i++){
            
            
            if(s+arr[i]<=m){
                s+=arr[i];
            }else{
                s=arr[i];
                k=k-1;
                if(k<0)return false;
            }
        }
        return true;
    }
}