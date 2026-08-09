package Arrays;

public class FindDuplicateElement {
    static void main() {
        int[] arr = {10, 20, 30, 30, 40};
        int repeate = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]) {
                    repeate = arr[i];
                    break;
                }
            }
        }
        System.out.println(repeate);


    }
}
