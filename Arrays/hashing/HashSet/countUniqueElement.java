package Arrays.hashing.HashSet;
import java.util.HashSet;
public class countUniqueElement{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5 , 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Unique elements: " + set);
        System.out.println("Total unique elements: " + set.size());
    }
}