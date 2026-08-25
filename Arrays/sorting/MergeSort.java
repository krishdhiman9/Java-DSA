package Arrays.sorting;

public class MergeSort {
    static void main() {
        int[] arr = {7, 4, 9, 2, 5};

                int mid = arr.length / 2;

                int[] left = new int[mid];
                int[] right = new int[arr.length - mid];

                for (int i = 0; i < mid; i++) {
                    left[i] = arr[i];
                }

                for (int i = mid; i < arr.length; i++) {
                    right[i - mid] = arr[i];
                }

                System.out.println("Left array:");
                for (int i = 0; i < left.length; i++) {
                    System.out.print(left[i] + " ");
                }

                System.out.println();

                System.out.println("Right array:");
                for (int i = 0; i < right.length; i++) {
                    System.out.print(right[i] + " ");
                }
            }
        }

