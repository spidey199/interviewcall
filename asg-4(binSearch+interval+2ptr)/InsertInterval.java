import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
     public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int[] current = intervals[i];

            if (current[1] < newInterval[0]) {
                res.add(current);
            }
            else if (current[0] > newInterval[1]) {
                res.add(newInterval);
                newInterval = current;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }

        res.add(newInterval);

        return res.toArray(new int[res.size()][]);
    }
}
