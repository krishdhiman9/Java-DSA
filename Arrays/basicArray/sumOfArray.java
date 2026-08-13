package Arrays.basicArray;
public class sumOfArray {
    public static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);

    }
}
