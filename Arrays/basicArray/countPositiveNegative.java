package Arrays.basicArray;

public class countPositiveNegative {
    static void main() {
        int[] arr = {10, -5, 20, -8, 0, 15, -2};
        int countPositive = 0;
        int countNegative = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                countPositive++;
            }
            else if(arr[i]<0){
                countNegative++;
            }
        }
        System.out.println("positive number is "+ countPositive);
        System.out.println("negative number is "+ countNegative);

    }
}
