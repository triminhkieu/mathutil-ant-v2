package com.kmt.mathutil.core.test;

import com.kmt.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    //ta se test tiep ham getF() voi n caf chon
    //n ca chon nghia la n < 0 | n > 20
    //thiet ke cua ham getF() nhu sau
    //khong them tinh, no chui, no tung ra, nem ra ngoai le
    //ten la Illegal Argument Exception
    //Do do: test case neu dua n = -5 thi expected se la: ngoai le
    //Junit 4: khong co ham assertEquals() cho Exception
    //Junit 5: co ham assertThrows()
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
    }
    
    
    //ta se viet cac test case, cac tinh huong test de
    //kiem tra ham getF() chay dung hay khong neu ta dua dau vao 
    //n tu te
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //test case #1: test getF() with n = 0
        //expected result: 1; kiem tra 0! co dung la 1 hem?
        //                  check if 0! == 1 or not ?
        int n = 0;
        long expected = 1; //hy vong 0! = 1
        long actual = MathUtility.getFactorial(n); //goi ham ma tinh
        Assert.assertEquals(expected, actual);
        //xanh neu 2 thang giong nhau == nhau
        //do neu 2 thang khac nhau!!!
        //test case #2: test getF() with n = 1;
        //expected: 1; check if 1 ! return 1
        //          kiem tra xem cos dung 1! == 1 hem?
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        //test case #3: test getF() with n = 2;
        //expected: 2; check if 2! return 2
        n = 2;
        expected = 2;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        //test case #4 test getF() with n = 3;
        //expected: 6; check if 3! return 6
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        //test case #5 test getF() with n = 120;
        //expected: 120; check if 5! returns 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
    @Test
    public void testRedGreen() {
        Assert.assertEquals(6789, 6789);
    }

}
