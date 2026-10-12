package Arrays.hashing.HashMap;
import java.util.HashMap;
public class FirstNonRepeatingElement {
    static void main() {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int [] arr = {4, 5, 1, 2, 1, 4};
        for(int i=0; i<arr.length; i++ ){
            int num=arr[i];
            if(map.get(num)==1){
                map.put(num,map.getOrDefault(arr[i],0)+1);
            }
            else{
                System.out.println(map);
                break;
            }

        }

    }
}
