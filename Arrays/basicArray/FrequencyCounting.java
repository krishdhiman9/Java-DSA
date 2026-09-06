package Arrays.basicArray;

public class FrequencyCounting {
    static void main() {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
