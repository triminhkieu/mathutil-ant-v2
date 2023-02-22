/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmt.mathutil.main;

import com.kmt.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentReturnsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }

    //kiem thu xem hamf getF() neu dua n sai
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //test case #6: test getF() with n  -1
        //expected value: 1 cau chui n nhu hach!!
        //thiet ke ham trong tinh huong nay phai xuat hien ngoai le
        System.out.println("Test -1!: expected: An Illegal Argument Exception is thrown!!"
                + "| actual: ???");
        MathUtility.getFactorial(-1);
    }

    //kiem thu xem ham getF() co duoc viet dung nhu thiet ke hay khong??
    //thiet ke: dua n tu te tu 0..20 -> tinh duoc n! dung nhu ki vong
    //          dua n sai, < 0 hoac > 20, CHUI
    //ta phai gia lap cac cach dung cua user/cua ai do khac
    //cach xai nghia la dua gia tri nao do cho ham -> xem ham
    //tra ve
    //moi cach dung ham, ung voi 1 n thi ham se chay voi n do
    //moi cach xai ham la not TEST CASE
    //quy tac dat ten ham danh cho kiem thu code: 
    //cu phap con lac da camelCase notation
    //ten ham mang luon y nghia/muc dich cua viec test
    public static void testFactorialGivenRightArgumentReturnsWell() {
        //test case #1: tinh huong xai ham so 1
        //              test getF() with n = 0
        //expected value: 1
        //vietsub: kiem thu xem ham getF() voi 1 tuc la tinh 1!
        //              coi co tra ve 1 hem?
        int n = 0;                  //tinh 0!
        long expectedValue = 1;     //hy vong return ve 1
        long actualValue = MathUtility.getFactorial(n);     //ham tinh di, xem cu the la may
        //kiem thu la so sanh expected vs. actual
        System.out.println("Test" + n + "!: expected " + expectedValue
                + " | actual: " + actualValue);
        //test case #2: test getF() with n = 1
        //expected value: 1
        //vietsub: kiem tra tinh huong xai ham tinh 1! coi co
        //tra ve 1 hay khong?
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + "!: expected " + expectedValue
                + " | actual: " + actualValue);
        //test case #3: test getF() with n = 2
        //expected value: 2
        //vietsub: kiem tra tinh huong dung ham tinh 2! coi co tra ve 2 hay khong?
        System.out.println("Test 2!: expected: 2 "
                + " | actual: " + MathUtility.getFactorial(2));
        //test case #4: test getF() with n = 3
        //expected value: 6
        //vietsub: kiem tra tinh huong dung ham tinh 3! coi co tra ve 6 hay khong?
        System.out.println("Test 3!: expected: 6 "
                + " | actual: " + MathUtility.getFactorial(3));
    }
}
