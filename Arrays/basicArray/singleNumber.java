package Arrays.basicArray;

public class singleNumber {
    static void main() {
        int [] arr  = {1,2,3,2,3,4,4,1,10};
        int result=0;

        for (int i=0; i<arr.length; i++){
            // XOR operator is used to cancel out duplicate elements
            // and return the element that appears only once.
            result = result ^ arr[i];

        }
        System.out.println(result);
    }
}
