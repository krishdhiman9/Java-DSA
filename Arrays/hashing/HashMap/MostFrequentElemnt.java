package Arrays.hashing.HashMap;

import java.util.HashMap;

public class MostFrequentElemnt {
    static void main() {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int mostfreq =0;

        int[] arr = {2, 3, 2, 5, 3, 2, 4};
        //for frequency
        for (int i=0; i<arr.length; i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }

         for(int i=0; i<arr.length;i++){
             int num = arr[i];
             if(map.get(num)>max){
                 max = map.get(num);
                 mostfreq = num;
             }
         }
        System.out.println("most frequent elemnt: "+mostfreq);
        System.out.println("frequency: "+ map.get(mostfreq));


    }}