package Arrays.basicArray;
import java.util.Arrays;
public class removeDuplicate {
    static void main() {
        int [] arr = {0, 0, 1, 1, 2, 2, 3};
        int k = 0;

        for(int i =0; i<arr.length; i++){
            if (arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
    }
}
