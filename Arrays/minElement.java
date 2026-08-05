package Arrays;

public class minElement {
    public static void main() {
        int[] arr = {100, 80, 30, 1, 40};
        int min = arr[0];
        for(int i = 0; i <arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
