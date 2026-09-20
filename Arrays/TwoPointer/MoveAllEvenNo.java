package Arrays.TwoPointer;
import java.util.Arrays;

public class MoveAllEvenNo {
    static void main() {
        int [] arr={3, 8, 5, 2, 7, 4};
        int slow = 0;
        int fast = 0;

        for (int i =0; i<arr.length; i++) {
            if (arr[fast] % 2 == 0) {
                arr[slow] = arr[fast];
                slow++;
            }
            fast++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
