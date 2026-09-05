package Arrays.basicArray;

public class containsDuplicates {
    static void  main() {
        int [] nums = {1,2,2,2,3,1};
    boolean result=false;

    for(int i=0; i<nums.length-1; i++){
        for(int j =i+1; j<nums.length; j++){
            if(nums[i] ==nums[j]){
                result = true;
            }
        }
    }
        System.out.println( result);
    }
}

