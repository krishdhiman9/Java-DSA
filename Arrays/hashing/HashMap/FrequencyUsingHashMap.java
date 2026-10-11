package Arrays.hashing.HashMap;
import java.util.HashMap;
public class FrequencyUsingHashMap {
    static void main() {
        int [] arr = {4, 4, 2, 4, 2, 7};

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
