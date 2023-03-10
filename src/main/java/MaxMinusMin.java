import java.util.ArrayList;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums. 
 * @return 
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int min = 10000000;
        int max = -10000000;
            for (int num: nums){
                if (num >= max) {
                   max = num; 
                   
                }
                if (num <= min) {
                    min = num;
                }
            }
        return (max-min);
}
} 

 






    
