package Arrays;
public class moveZeroes {
    static void main() {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i= index; i<arr.length; i++){
            arr[i]=0;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
