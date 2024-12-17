package utils;

import java.time.LocalDate;

import model.person.NgayThangNam;

public class Date {
    public static NgayThangNam now() {
        LocalDate today = LocalDate.now();
        // System.out.println(today);
 
        // Chuyển đổi từng thành phần thành String bằng cộng chuỗi
        String year = today.getYear() + "";
        String month = today.getMonthValue() + "";
        String day = today.getDayOfMonth() + "";
        return new NgayThangNam(day, month, year);
    }
}
