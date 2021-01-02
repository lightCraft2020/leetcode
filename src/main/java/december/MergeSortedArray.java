package december;

/**
 *100%
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(0 == n){
            return ;
        }

        int[] h = new int[m];
        for (int i = 0; i < m ; i++) {
            h[i] = nums1[i];
        }

        int total = m+n;
        int j = 0;
        int k = 0;
        for (int i = 0; i < total ; i++) {
            if(j < m && k < n) {
                if (h[j] <= nums2[k]) {
                    if (j < m) {
                        nums1[i] = h[j];
                        j++;
                    } else {
                        nums1[i] = nums2[k];
                        k++;
                    }
                } else {
                    if (k < n) {
                        nums1[i] = nums2[k];
                        k++;
                    } else {
                        nums1[i] = h[j];
                        j++;
                    }
                }
            } else if(j == m){
                nums1[i] = nums2[k];
                k++;
            } else if(k == n){
                nums1[i] = h[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {

/*        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;*/
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        merge(nums1, m,  nums2,  n);
        System.out.println(nums1);

    }

}
