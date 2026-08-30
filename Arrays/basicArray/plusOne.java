package Arrays.basicArray;
import java.util.Arrays;

public class plusOne {
    static void main() {
        int[] arr = {1, 2, 9};
        int[] newArr= new int[arr.length+1];

        for (int i =arr.length-1; i>=0; i--){
            if(arr[i]==9){
                arr[i]=0;

            }
            else {
                arr[i] = arr[i]+1;
                break;
            }
            newArr[i]=arr[i];
        }
        newArr[0]=newArr[0]+1;
        System.out.println(Arrays.toString(newArr));
    }
}
