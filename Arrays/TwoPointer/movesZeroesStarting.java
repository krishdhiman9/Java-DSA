package Arrays.TwoPointer;

import java.util.Arrays;

public class movesZeroesStarting {
    static void main() {
        int[] arr = {0, 1, 0, 3, 0, 12};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                index++;
            }
        }

        int nonZero = index;

        // Original array ko overwrite nahi karna
        int[] temp = new int[arr.length];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                temp[nonZero] = arr[j];
                nonZero++;
            }
        }

        // Zeroes beginning mein
        for (int i = 0; i < index; i++) {
            temp[i] = 0;
        }

        System.out.println(Arrays.toString(temp));
    }
}