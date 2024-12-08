package model.person;

import java.util.Scanner;


public class NgayThangNam {
    private String ngay,thang,nam;
    //thiết lập thông tin tổng thể
    public NgayThangNam(){}

    public NgayThangNam(String ngay, String thang, String nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void setInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap: <ngay>.<thang>.<nam>\nBan nhap la: ");
        String[] a = (sc.nextLine()).split("[/\\s\\.]+");
        this.ngay = a[0];
        this.thang = a[1];
        this.nam = a[2];
    }
    //thiết lập thông tin từng thành phần
    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    public void setThang(String thang) {
        this.thang = thang;
    }
    public void setNam(String nam) {
        this.nam = nam;
    }
    //lấy thông tin từng thành phần
    public String getNgay() {
        return ngay;
    }
    public String getThang() {
        return thang;
    }
    public String getNam() {
        return nam;
    }
    //hiển thị và lấy thông tin tổng thể đưa ra trên 1 dòng
    public void show() {
        System.out.printf(this.getInfor());
    }
    public String getInfor() {
        return this.ngay + "/" + this.thang + "/" + this.nam;
    }
    public int compareTo(NgayThangNam date) {
        int k = this.nam.compareTo(date.getNam());
        if (k != 0) 
            return k;
        k = this.thang.compareTo(date.getThang());
        if (k != 0) 
            return k;
        return this.ngay.compareTo(date.getNgay());
    }
}
