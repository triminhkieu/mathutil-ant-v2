
package com.kmt.mathutil.core.test;

import com.kmt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvancedTest {
    
    //chuan bi data la mang 2 chieu kieu Object
    
    //JUnit tu loop duyet mang loi tach data ra
    
    //giup ta nhoi//fill/do vao amf assertEquals()
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]   {{0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {4, 24}, 
                                {5, 120}, 
                                {6, 720}};
    }
    //map tung cot cua tung dong vao 2 bien tuong ung n & expected
    @Parameterized.Parameter(value = 1) //em thich cot 1
    public long expected;
    @Parameterized.Parameter(value = 0) //em thich cot 0
    public int n;
    
    //so sanh expected va actual
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}
