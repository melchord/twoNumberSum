package source;
/**
 * Class to handle all the logic of finding if a target sum is within
 * an array
 * @author - Melchor Dominguez
 * @version 10/25/2019
 */
public class TwoSum{
    
    /**
     * Function which will determine if there are two numbers
     * within the array which can add up to a target sum
     * @param array - non-empty array of distinct integers
     * @param targetSum - integer which will try to be set
     * @return empty array - if no combinations are found
     *         int[2] - if there were 2 numbers which met the target sum
     */
    public static int[] twoNumberSum(int[] array, int targetSum){
        //Initialize an array with a max size of 2
        int[] sumArray = new int[2];

        //algorithm to determine if there are 2 numbers which satisfy the target sum
        //could later be broken up in helper method(s)
        for(int i = 0; i < array.length; i++){
            for(int j = i +1; j < array.length; j++){

                if(array[i] + array[j] == targetSum){//two numbers have satisfied the target sum
                    if(array[i] < array[j]){//keep the smaller number in the first spot
                        sumArray[0] = array[i];
                        sumArray[1] = array[j];
                    }else{
                        sumArray[0] = array[j];
                        sumArray[1] = array[i];
                    }
                    return sumArray;
                }

            }
        }

        return new int[0];

    }

}
