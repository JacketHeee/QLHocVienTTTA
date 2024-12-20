package model.thanhtoan_khuyenmai;

import java.util.ArrayList;

import model.khoahoc.LopHoc;
import model.person.*;
import model.user.HocVien;
import utils.Chuoi;

public class HoaDonThanhToan {
    private String maHoaDon;
    private HocVien hocVien;
    private ArrayList<LopHoc> lopHoc;
    private KhuyenMai khuyenMai;
    private NgayThangNam ngayPhatHanh;
    private String tinhTrang; // 'ChuaThanhToan', 'DaThanhToan', 'DaHuy','chua xong'
    private double tongTien;
    private String phuongThucThanhToan; // 'TienMat', 'ChuyenKhoan'
    private NgayThangNam ngayThanhToan;
    private double soTienThanhToan;
    private String ghiChu;
    private NgayThangNam ngayHetHan;

    // Constructor
    public HoaDonThanhToan(String maHoaDon, HocVien hocVien, ArrayList<LopHoc> lopHoc, KhuyenMai khuyenMai, 
                           NgayThangNam ngayPhatHanh, String tinhTrang, double tongTien, 
                           String phuongThucThanhToan, NgayThangNam ngayThanhToan, double soTienThanhToan, 
                           String ghiChu, NgayThangNam ngayHetHan) {
        this.maHoaDon = maHoaDon;
        this.hocVien = hocVien;
        this.lopHoc = lopHoc;
        this.khuyenMai = khuyenMai;
        this.ngayPhatHanh = ngayPhatHanh;
        this.tinhTrang = tinhTrang;
        this.tongTien = tongTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.soTienThanhToan = soTienThanhToan;
        this.ghiChu = ghiChu;
        this.ngayHetHan = ngayHetHan;
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public ArrayList<LopHoc> getlopHoc() {
        return lopHoc;
    }

    public void setlopHoc(ArrayList<LopHoc> lopHoc) {
        this.lopHoc = lopHoc;
    }

    public KhuyenMai getkhuyenMai() {
        return khuyenMai;
    }

    public void setkhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public NgayThangNam getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(NgayThangNam ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public NgayThangNam getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(NgayThangNam ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public double getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NgayThangNam getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(NgayThangNam ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public double soTienConNo() {
        return this.tongTien - this.soTienThanhToan;
    }

    

    @Override
    public String toString() {
        return "HoaDonThanhToan [" + maHoaDon + ", " + hocVien + ", " + lopHoc + ", "
                + khuyenMai + ", " + ngayPhatHanh + ", " + tinhTrang + ", " + tongTien
                + ", " + phuongThucThanhToan + ", " + ngayThanhToan
                + ", " + soTienThanhToan + ", " + ghiChu + ", " + ngayHetHan + "]";
    }

    public void show() {
        // System.out.println("=============HOA DON THANH ==========");
        System.out.println("");
        System.out.printf("%-71s\n\n",Chuoi.centerText("       \033[1mHOA DON THANH TOAN\033[0m", 71));
        System.out.println(Chuoi.line(71,'-'));
        System.out.println("Ma hoa don: " + maHoaDon);
        System.out.println("Ngay phat hanh: " + ngayPhatHanh.getInfor());
        System.out.println(Chuoi.line(71,'-'));
        System.out.println("\033[4mThong tin hoc vien:\033[0m");
        System.out.println("\tHo va ten: " + hocVien.getHoten());
        System.out.println("\tSo dien thoai: " + hocVien.getMaNguoiDung().getSoDienthoai());
        System.out.println("\tEmail: " + hocVien.getMaNguoiDung().getEmail());
        System.out.println(Chuoi.line(71,'-'));
        System.out.println("\033[4mThong tin cac lop hoc:\033[0m");
        if (lopHoc != null && !lopHoc.isEmpty()) {
            LopHoc.displayListInHoaDon(lopHoc);
        } else {
            System.out.println("  Khong co lop hoc nao.");
        }
        System.out.printf("%71s\n", String.format(" Tong tien: %.2f VND",tongTien));
        System.out.println(Chuoi.line(71,'-'));
        System.out.println("\033[4mThong tin thanh toan:\033[0m");
        if (khuyenMai != null) {
            System.out.println("\tKhuyen mai ap dung: " + khuyenMai.getTenKhuyenMai());
        } else {
            System.out.println("\tKhuyen mai ap dung: Khong co.");
        }
        System.out.println("\tPhuong thuc thanh toan: " + phuongThucThanhToan);
        System.out.println("\tNgay thanh toan: " + (ngayThanhToan != null ? ngayThanhToan.getInfor() : "Chua thanh toan"));
        System.out.printf("\tSo tien da thanh toan: %.1f VND\n ",soTienThanhToan);
        System.out.println("\tNgay het han: " + (ngayHetHan != null ? ngayHetHan.getInfor() : "Khong co"));
        System.out.println("\tTinh trang: " + tinhTrang);
        System.out.println(Chuoi.line(71,'-'));
        if (ghiChu != null && !ghiChu.isEmpty()) {
            System.out.println("\033[4mGhi chu:\033[0m " + ghiChu);
        } else {
            System.out.println("\033[4mGhi chu: Khong co.\033[0m");
        }
       System.out.println(Chuoi.line(71,'=') + "\n");
    }
}
