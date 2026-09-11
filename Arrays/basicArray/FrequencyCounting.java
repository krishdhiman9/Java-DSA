package Arrays.basicArray;

public class FrequencyCounting {
    static void main() {
        int [] a = {2,3,2,5,2,3};

        for(int i = 0; i<a.length; i++){
            boolean alreadycount = false ;

            for(int k=0; k<i; k++){
                if (a[i]==a[k]){
                    alreadycount = true;
                    break;
                }
            }
            if(alreadycount){
                continue;
            }
            int count = 0;
            for (int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println( a[i] + " is occuring " + count + " times");
        }
    }
}