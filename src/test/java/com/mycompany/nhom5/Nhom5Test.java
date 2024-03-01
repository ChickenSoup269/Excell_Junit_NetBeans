/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.nhom5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien, Tho, Tin
 */
public class Nhom5Test {
    
    public Nhom5Test() {
    }
    // ID: T01 | Note: Bảng 1, cột 1 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]    
    @Test
    public void testIsValidateDate_T01() {
        System.out.println("*** Ngày hợp lệ | ID: T01 ***");
        int year = 2024;
        int month = 1;
        int day = 31;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }
    
     @Test
    public void testDaysInMonth_T01() {
        System.out.println("*** Ngày Trong Tháng | ID: T01 ***");
        int year = 2024;
        int month = 1;
        Nhom5 instance = new Nhom5();
        int expResult = 31;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T01 với month là: " + expResult + " của " + month+"/"+year );
    }
    
    // ID: T02 | Note: Bảng 1, cột 2 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]
    @Test
    public void testIsValidateDate_T02() {
        System.out.println("*** Ngày hợp lệ | ID: T02 ***");
        int year = 2024;
        int month = 1;
        int day = 31;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }

    @Test
    public void testDaysInMonth_T02() {
        System.out.println("*** Ngày Trong Tháng | ID: T02 ***");
        int year = 2024;
        int month = 1;
        Nhom5 instance = new Nhom5();
        int expResult = 31;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T02 với month là: " + expResult + " của " + month+"/"+year );
    }
    
    // ID: T08 | Note: Bảng 2, cột 1 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]
    @Test
    public void testIsValidateDate_T08() {
        System.out.println("*** Ngày hợp lệ | ID: T08 ***");
        int year = 2024;
        int month = 4;
        int day = 30;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }
    
    @Test
    public void testDaysInMonth_T08() {
        System.out.println("*** Ngày Trong Tháng | ID: T08 ***");
        int year = 2024;
        int month = 4;
        Nhom5 instance = new Nhom5();
        int expResult = 30;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T03 với month là: " + expResult + " của " + month+"/"+year );
    }
    
    // ID: T09 | Note: Bảng 2, cột 2 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]
    @Test
    public void testIsValidateDate_T09() {
        System.out.println("*** Ngày hợp lệ | ID: T09 ***");
        int year = 2024;
        int month = 6;
        int day = 30;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }
    
    @Test
    public void testDaysInMonth_T09() {
        System.out.println("*** Ngày Trong Tháng | ID: T09 ***");
        int year = 2024;
        int month = 6;
        Nhom5 instance = new Nhom5();
        int expResult = 30;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T09 với month là: " + expResult + " của " + month+"/"+year );
    }
    
    // ID: T12 | Note: Bảng 3, cột 1 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]
    @Test
    public void testIsValidateDate_T12() {
        System.out.println("*** Ngày hợp lệ | ID: T12 ***");
        int year = 2024;
        int month = 2;
        int day = 29;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }
    
    @Test
    public void testDaysInMonth_T12() {
        System.out.println("*** Ngày Trong Tháng | ID: T12 ***");
        int year = 2024;
        int month = 2;
        Nhom5 instance = new Nhom5();
        int expResult = 29;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T12 với month là: " + expResult + " của " + month+"/"+year );
    }
    
    // ID: T13 | Note: Bảng 3, cột 2 [NGÀY HỢP LỆ VÀ NGÀY TRONG THÁNG]
    @Test
    public void testIsValidateDate_T13() {
        System.out.println("*** Ngày hợp lệ | ID: T13 ***");
        int year = 2024;
        int month = 2;
        int day = 29;
        Nhom5 instance = new Nhom5();
        boolean expResult = true;
        boolean result = instance.IsValidateDate(year, month, day);
        assertEquals(expResult, result);
        System.out.println("Hợp lệ: " + day+"/"+month+"/"+year);
    }
    
    @Test
    public void testDaysInMonth_T13() {
        System.out.println("*** Ngày Trong Tháng | ID: T13 ***");
        int year = 2024;
        int month = 2;
        Nhom5 instance = new Nhom5();
        int expResult = 29;
        int result = instance.DaysInMonth(year, month);
        assertEquals(expResult, result);
        System.out.println("Kết quả mong đợi của T13 với month là: " + expResult + " của " + month+"/"+year );
    }
}
