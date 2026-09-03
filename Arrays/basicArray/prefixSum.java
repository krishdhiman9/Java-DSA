package Arrays.basicArray;
import java.util.Arrays;
public class prefixSum {
    static void main() {
        int [] arr={2, 4, 1, 3, 5};

        for(int i=1; i<arr.length; i++){
             arr[i] = arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
