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
        System.out.println(map.get(101) +" "+  map.get(103));
        System.out.println();

    }
}
