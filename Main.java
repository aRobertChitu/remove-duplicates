import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {

        int distinctElements = 1;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[distinctElements] = nums[i+1];
                distinctElements++;
            }
        }
        return  distinctElements;
    }


}