public class MediaTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int l = 0, r = nums1.length;

        int lps = (m + n + 1) / 2;

        while (l <= r) {
            int px = (l + r) / 2;
            int py = lps - px;
            
            int ax = px==0?Integer.MIN_VALUE:nums1[px - 1];
            
            int bx = py==0?Integer.MIN_VALUE:nums2[py - 1];
            int ay = px==m?Integer.MAX_VALUE:nums1[px];
            int by = py==n?Integer.MAX_VALUE:nums2[py];

            if (ax <= by && bx <= ay) {
                if ((m + n) % 2 == 1) {
                    return Math.max(ax, bx) / 1.0;
                } else {
                    return (Math.max(ax, bx) + Math.min(ay, by)) / 2.0;
                }
            } else if (ax > by) {
                r = px - 1;
            } else {
                l = px + 1;
            }
        }
        return -1;
    }
}

