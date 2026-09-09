package Arrays.basicArray;

public class FrequencyCounting {
    static void main() {

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 3};

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            for (int j = i; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " is occurring " + count + " times");
        }
    }
}