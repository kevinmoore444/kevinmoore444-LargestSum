
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int max1 = Integer.MIN_VALUE;
        int max1Index = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        //Loop through the list to find the largest value and store it as max1
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)> max1){
                max1 = nums.get(i);
                max1Index = i;
            }
        }
        //Remove that largest value from the list
        nums.remove(max1Index);
        //Loop through the list to find the largest remaining value and store it as max2
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)> max2){
                max2 = nums.get(i);
            }
        }
        return max1+max2;
    }
}
