package Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 21, 30, 45, 50, 63};
        int even = 0;
        int odd = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("no. of even is "+even);
        System.out.println("no. of odd is "+odd);
    }
}