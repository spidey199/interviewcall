public class KokoEatingBanana {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        int ans = Integer.MAX_VALUE;
        int l=1;
        
        while(l<=r){
            int m = l + (r-l)/2;

            if(isItPossible(piles, m, h)){
                
                ans=Math.min(ans, m);
                r=m-1;
            }
            else{
                l=m+1;
            }

        }
        return ans;
    }
    boolean isItPossible(int piles[], int speed, int h){
        int hours = 0;
         for (int pile : piles) {
            hours += (pile + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }
        return true;
    }

}

/**

1 2 3 4  5 6 7 8 9 10 11
    m  l             
ans=6

 */
}
