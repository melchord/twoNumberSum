package test;

import source.TwoSum;

import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Junit tests for class which will determine if an array contains
 * two numbers that reach a target sum
 *
 * @author - Melchor Dominguez
 * @version - 10/31/2019
 */
public class Tests{
    
    @Test
    public void TestCase1(){
        int[] expected = {4, 6};
        assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {4,6}, 10), expected));
    }

    @Test
    public void TestCase2(){
        int[] expected = {2, 5};
        assertTrue(Arrays.equals(TwoSum.twoNumberSum(new int[] {5, 6, 2}, 7), expected));
    }
    
    @Test
    public void TestCase3(){
        int[] expected = {};
        assertTrue(
            Arrays.equals(
                TwoSum.twoNumberSum(new int[] {-21, 301, 12, 4, 65, 56,210, 356, 9, -47}, 164),
                expected));
    }
    
    @Test
    public void TestCase4(){
        int[] expected = {};
        assertTrue(
            Arrays.equals(TwoSum.twoNumberSum(new int[] {3,5, -4, 8, 11, 1, -1, 6}, 15), expected));
    }

}
