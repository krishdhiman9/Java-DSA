package Arrays.TwoPointer;
public class ContainerWithMostWater {
    static void main() {
        int [] c = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = c.length -1;
        int maxwater  = 0 ;

        while(left<right) {
            int w = right - left;
            int h = Math.min(c[left], c[right]);
            int currentwater = w * h;
            maxwater = Math.max(currentwater, maxwater);

            if(c[left]<c[right]){
                left++;
            }
            else {
                right--;
            }

        }
        System.out.println(maxwater);
    }
}

