package Arrays.hashing;
import java.util.HashSet;
public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 5, 2};
        boolean result = false;

        HashSet<Integer> set =new HashSet<>();
        for(int num : arr){
            if (set.contains(num)){
                result = true;
            }
            set.add(num);
        }
        System.out.println(result);
    }
}