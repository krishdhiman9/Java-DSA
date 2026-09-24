package Arrays.TwoPointer;

public class ContainerWithMostWater {
    static void main() {
        int [] c = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = c.length -1;
        int width = 0;
        //int max = 0 ;

        while(left<right){
            if(c[left]<c[right]){
                width =right-left;
                int max = left*width;
                left++;
            }
            else{
                right--;
            }
        }
    }
}
