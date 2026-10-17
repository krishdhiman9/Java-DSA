package Arrays.hashing.HashMap;

public class TwoSum {
    static void main() {
        int [] arr = {2, 11, 7, 15};
        int tar = 9;

         for(int i=0; i<arr.length ; i++){
             for(int j=i+1; j<arr.length; j++){
                 if (tar==arr[i]+arr[j]){
                     System.out.println(i + " " + j);
                 }
             }
         }
    }
}
