package Arrays.TwoPointer;
public class moveZeroes {
//    static void main() {
//        int[] arr = {0, 1, 0, 3, 0, 12};
//        int index = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//
//        for(int i= index; i<arr.length; i++){
//            arr[i]=0;
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }


public static void main() {
    int[] arr = {0, 1, 0, 3, 0, 12};
    int index = 0;

    // Count zeroes
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            index++;
        }
    }

    // Put non-zero elements after zeroes
    int j = index;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[j] = arr[i];
            j++;
        }
    }

    // Put zeroes at beginning
    for (int i = 0; i < index; i++) {
        arr[i] = 0;
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

}

