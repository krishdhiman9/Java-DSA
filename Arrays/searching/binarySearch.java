package Arrays.searching;

public class binarySearch {
    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int left = 0;
        int right = arr.length - 1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                System.out.println("Element found at index: "+ mid);
                return;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("element not found");
    }
}
