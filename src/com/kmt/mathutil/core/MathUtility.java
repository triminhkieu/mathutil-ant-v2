/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kmt.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    public static final double PI = 3.1415;
    
    //ham getFactorial la ham tinh n!
    //quy uoc: n! = 1*2*3*4*...*n
    //quy uoc 0! = 1
    //khong co giai thua cua so am
    //thiet ke cua ham tinh giai thua cua chung ta
    //ham khong tinh gia thua am, neu dua am giai thua, CHUI
    //DAP VAO MAT NGUOI DUNG HAM 1 EXCEPTION
    //ham khong tinh giai thua qua to, khong tinh gia thua 21 tro len 
    //vi kieu long chi co toi da 18 so 0
    //ma 21! lon hon 18 so 0, tran kieu long, tinh sai
    //CHUI, KHONOG SUPPORT GIAI THUA AM, GIAI THUA QUA BU!!
    //nguoi QC phai kiem tra xem ham co hanh xu dung nhu thiet ke hay khong??
    //phai test, thu nghiem cac tinh huong xai ham (cac TEST CASE)
    public static long getFactorial(int n) {
        if (n < 0 || n >21) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        if (n == 0 || n ==1) {
            return 1;
        }
        //song sot den lenh duoi day, sure n = 2..20
        long product = 1; //tich nhan don!!
        for (int i = 2; i <= n; i++) { //make the code wrong
                                       //make the code green again and 4ever
            product *= i;
        }
        return product;
    }
}
