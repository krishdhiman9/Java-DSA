package Arrays.basicArray;

public class SecondLrgstNo {
    public static void main(String [] args) {
        int []arr = {5, 100, 80, 70, 60};
        int largest = arr[0];
        int scndlargst = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest<arr[i]){
                scndlargst = largest;
                largest = arr[i];
            }
            else if(scndlargst<arr[i]){
                scndlargst = arr[i];
            }
        }
        System.out.println("largest element found "+ largest);
        System.out.println("second largest element found "+ scndlargst);
    }
}
