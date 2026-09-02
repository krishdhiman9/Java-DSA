package Arrays.basicArray;
import java.util.Arrays;
public class prefixSum {
    static void main() {
        int [] arr={2, 4, 1, 3, 5};
        int sum = 0;

        for(int i=0; i<arr.length-1; i++){
             arr[i] = arr[i+1]+arr[i];
             arr[i] = sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
