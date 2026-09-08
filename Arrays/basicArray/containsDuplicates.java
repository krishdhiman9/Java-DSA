package Arrays.basicArray;
import java.util.HashSet;

//public class containsDuplicates {
//    static void  main() {
//        int [] nums = {1,2,2,2,3,1};
//    boolean result=false;
//
//    for(int i=0; i<nums.length-1; i++){
//        for(int j =i+1; j<nums.length; j++){
//            if(nums[i] ==nums[j]){
//                result = true;
//            }
//        }
//    }
//        System.out.println( result);
//    }
//}



import java.util.HashSet;

public class containsDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 1};

        boolean result = false;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                result = true;
                break;
            }

            set.add(num);
        }

        System.out.println(result);
    }
}