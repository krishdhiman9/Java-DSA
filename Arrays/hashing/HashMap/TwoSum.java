package Arrays.hashing.HashMap;
import java.util.HashMap;

public class TwoSum {
    static void main() {
        int [] arr = {2,11,7,15};
        int target= 9;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int required = target - arr[i];
            if(map.containsKey(required)){
                System.out.println(map.get(required) + ", " + i);
            }
            else{
                map.put(arr[i], i);
        }
}}}