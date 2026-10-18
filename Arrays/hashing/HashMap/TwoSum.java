package Arrays.hashing.HashMap;
import java.util.HashMap;

public class TwoSum {
    static void main() {
        int [] arr = {2, 11, 7, 15};
        int tar = 9;
        HashMap <Integer , Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int req = tar - arr[i];
            map.put(req,map.getOrDefault(req,0))
        }
    }
}