package Arrays.sorting;

public class bubbleSort {
    static void main() {
        int [] arr = { 3, 9, 2, 1, 7, 8 ,4};
        int tem = 0;

        for(int i = 0; i<arr.length-1; i++){
            for (int j=0; j <arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }

        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
