package model.khoahoc;

import java.util.ArrayList;

import database.khoahoc.ChuongTrinhDB;
import model.person.NgayThangNam;
import services.LopHocServices;
import utils.Date;

public class KhoaHoc {
    private String maKhoaHoc;
    private CapBac capBac;
    private String tenKhoaHoc;
    private String moTa;
    private double hocPhi;
    private ArrayList<LopHoc> lopHocs;

    public KhoaHoc() {
        this.capBac = new CapBac();
        this.lopHocs = new ArrayList<>();
    }

    public KhoaHoc(String maKhoaHoc, CapBac capBac, String tenKhoaHoc, String moTa, double hocPhi) {
        this.maKhoaHoc = maKhoaHoc;
        this.capBac = capBac;
        this.tenKhoaHoc = tenKhoaHoc;
        this.moTa = moTa;
        this.hocPhi = hocPhi;
    }

    public void addLopHoc(LopHoc lopHoc) {
        this.lopHocs.add(lopHoc);
    }
    // Getter and Setter methods
    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public CapBac getcapBac() {
        return capBac;
    }

    public void setcapBac(CapBac capBac) {
        this.capBac = capBac;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    

    public ArrayList<LopHoc> getLopHocs() {
        return lopHocs;
    }

    

    public void setLopHocs(ArrayList<LopHoc> lopHocs) {
        this.lopHocs = lopHocs;
    }

    @Override
    public String toString() {
        // return "[" + "Ten: " + tenKhoaHoc + ", moTa: " + moTa + ", hocPhi: " + hocPhi
        //         + "]";
        return String.format("%-25s | %-35s | %-20s | %-10s | %.1f",capBac.getChuongTrinh().getTenChuongTrinh(),capBac.getTenCapBac(),tenKhoaHoc,capBac.getThoiGianHoc()+" Tuan",hocPhi);
    }

    // public String inlineString() {
    //     return 
    // }
    
    public void show() {
        System.out.println(this.toString());
    }

    public ArrayList<LopHoc> getLopHocSapKhaiGiang () {
        NgayThangNam daynow = Date.now();
        ArrayList<LopHoc> listToShow = new ArrayList<>();
        for (LopHoc x : lopHocs) 
            if (x.getkhoaKhaiGiang().getThoiGianBatDau().compareTo(daynow) > 0) 
                listToShow.add(x);
        return listToShow;
        
    }

    public void showAllInfor() {
        ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB();
        System.out.println("============THONG TIN CHI TIET KHOA HOC===============");
        System.out.printf("\033[2;4m%s > %s\n\n\033[0m",capBac.getChuongTrinh().getTenChuongTrinh(),capBac.getTenCapBac());
        System.out.println("\033[1mKHOA HOC: " + tenKhoaHoc.toUpperCase() + "\033[0m");
        System.out.println("\033[37m" + moTa + "\033[0m\n");
        System.out.println("Thoi gian hoc: " + capBac.getThoiLuongString() + "\n");
        System.out.println("Cac lop hoc kha dung"  + "\n");
        LopHoc.displayListInHoaDon(getLopHocSapKhaiGiang());
        System.out.println();
    }

    public int compareTo(KhoaHoc b) {
        int k = this.getcapBac().getChuongTrinh().getMaChuongTrinh().compareTo(b.getcapBac().getChuongTrinh().getMaChuongTrinh());
        if (k != 0) 
            return k; 
        k = this.getcapBac().getMaCapBac().compareTo(b.getcapBac().getMaCapBac());
        if (k != 0) 
            return k;
        return this.getMaKhoaHoc().compareTo(b.getMaKhoaHoc());
    }

    public static void main(String[] args) {
    //    LocalDate today = LocalDate.now();
    //    System.out.println(today);

    //     // Chuyển đổi từng thành phần thành String bằng cộng chuỗi
    //     String year = today.getYear() + "";
    //     String month = today.getMonthValue() + "";
    //     String day = today.getDayOfMonth() + "";

    //     NgayThangNam daynow = new NgayThangNam(day, month, year); 
    //     daynow.show();

    //     LopHocDB lopHocDB = new LopHocDB();

    //     for (LopHoc x : lopHocDB.getlistLopHoc()) 
    //         if (x.getkhoaKhaiGiang().getThoiGianBatDau().compareTo(daynow) > 0) 
    //             x.show();
        // System.out.print("\033[4mThis is \033[1mbold  \033[4mtext");
        System.out.print("\033[1mBold Red Text\033[0m"); // Chữ đậm và màu đỏ

    }
}
