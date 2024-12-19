package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public static NgayThangNam timNgay(NgayThangNam ngayBatDau, int soNgay) {
        // Chuyển ngày bắt đầu thành LocalDate
        LocalDate startDate = ngayBatDau.toLocalDate();
        // Cộng số ngày
        LocalDate resultDate = startDate.plusDays(soNgay);
        // Chuyển lại thành NgayThangNam
        return NgayThangNam.fromLocalDate(resultDate);
    }

    public static NgayThangNam format(NgayThangNam date) {
        // Đảm bảo định dạng ngày, tháng, năm
        String formattedNgay = String.format("%02d", Integer.parseInt(date.getNgay()));
        String formattedThang = String.format("%02d", Integer.parseInt(date.getThang()));
        String formattedNam = String.format("%04d", Integer.parseInt(date.getNam()));
        
        // Tạo một đối tượng NgayThangNam mới với định dạng chuẩn
        return new NgayThangNam(formattedNgay, formattedThang, formattedNam);
    }
    

    public static void main(String[] args) {
        timNgay(new NgayThangNam("1","1","2024"), 30).show(); 
    }
}
