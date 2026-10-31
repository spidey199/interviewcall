package asg-4(binSearch+interval+2ptr);

import java.util.Arrays;


public class MergeInterval {
public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        int[][] res = new int[intervals.length][intervals[0].length];

         res[0][0] = intervals[0][0];
        res[0][1] = intervals[0][1];

        int count = 1;
        for(int i=1;i<intervals.length;i++){
            int[] last = res[count-1];
            int inter[]  = intervals[i];

            if(inter[0] <= last[1])
            {last[0] = Math.min(last[0], inter[0]);
            last[1] = Math.max(last[1], inter[1]);
            }
            else{
                res[count][0] = inter[0];
                res[count][1] = inter[1];
                count++;
            }
            
        }
         return Arrays.copyOf(res, count);
    }
}
