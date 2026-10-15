package Arrays.hashing.HashMap;
import java.util.HashMap;
public class FirstNonRepeatingElement {
    static void main() {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int[] arr = {3, 7, 3, 9, 7, 5};

        //count frequency
        for(int i=0; i<arr.length; i++ ) {
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //first non repeating element
            for(int i=0; i<arr.length; i++){
                int num = arr[i];
                if(map.get(num)==1){
                    System.out.println(num);
                    break;
                }
            }
        }
}