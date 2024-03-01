/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nhom5;

/**
 *
 * @author Thien, Tho, Tin
 */
public class Nhom5 {
   public boolean IsValidateDate(int year, int month, int day){
        if (month>=1 && month<=12){
            if (day>=1 && day<=DaysInMonth(year, month)){
                return true;
            }else {
                return false;   
            }
        }
        else{
            return  false;
        }
    }
   public int DaysInMonth(int year, int month) {
        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                return 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1; // Tháng không hợp lệ
        }
    }
}
