package Arrays.hashing.HashMap;
import java.util.HashMap;

public class TwoSum {
    static void main() {
        int [] arr  = {4, 5, 1, 2, 1, 4};
        int target = 6;

        HashMap <Integer, Integer > map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int req = target - arr[i];
            if(map.containsKey(req)){
                System.out.println(map.get(req) + " " + i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}