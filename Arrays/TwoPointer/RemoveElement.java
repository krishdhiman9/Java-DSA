package Arrays.TwoPointer;

public class RemoveElement {
    static void main() {
        int [] a = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = 0;

        for(int i = 0; i<a.length; i++){
            if(val!=a[i]){
                a[k]=a[i];
                k++;
            }
        }
        for(int i = 0; i<k; i++) {
            System.out.print (a[i]+ " ");
        }
    }
}
