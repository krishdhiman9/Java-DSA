package Arrays.hashing.HashMap;
import java.util.HashMap;
public class basics {
    static void main() {
        HashMap <Integer, String> map = new HashMap<>();
        //put is used to add data in map.
        map.put(101, "Krish");
        map.put(102, "Rahul");
        map.put(103, "Aman");
        //get used for print value
        System.out.println(map.get(101) +" "+ map.get(102)+ " "+   map.get(103));

        //use integer + integer
        HashMap <Integer, Integer> set = new HashMap<>();
        set.put(101, 1);
        set.put(102, 2);
        set.put(103, 3);
        System.out.println(set.get(101));


        //containskey for find information in map
        System.out.println(map.containsKey(105));
        System.out.println(map.containsKey(101));
    }
}