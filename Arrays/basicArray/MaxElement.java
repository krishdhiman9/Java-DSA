package Arrays.basicArray;

public class MaxElement {
    public static void main() {
        int[] arr = {10, 80, 30, 100, 40};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum element found:"+ max);
    }
}
