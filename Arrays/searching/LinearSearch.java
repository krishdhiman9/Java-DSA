package Arrays.searching;

public class LinearSearch {
    public static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        int num = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}
