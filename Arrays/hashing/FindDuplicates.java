package Arrays.hashing;
import java.util.HashSet;
public class FindDuplicates {

    static void main() {

        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1, 2, 3, 4, 3};
        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println(num);
            }
            set.add(num);
        }
        System.out.println("no duplicate");
    }
}