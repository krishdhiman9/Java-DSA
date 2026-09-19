package Arrays.TwoPointer;
import java.util.Arrays;
public class MergeSortedArray {
    static void main() {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; //i
        int[] nums2 = {2, 5, 6}; //j

        int m = 3;
        int n = 3;

        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;


        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));

    }
}
