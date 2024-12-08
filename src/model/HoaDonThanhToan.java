package model;

import model.person.*;

public class HoaDonThanhToan {
    private String maHoaDon;
    private String maHocVien;
    private String maLopHoc;
    private String maChuongTrinhKhuyenMai;
    private NgayThangNam ngayPhatHanh;
    private String tinhTrang; // 'ChuaThanhToan', 'DaThanhToan', 'DaHuy'
    private double tongTien;
    private String phuongThucThanhToan; // 'TienMat', 'ChuyenKhoan'
    private NgayThangNam ngayThanhToan;
    private double soTienThanhToan;
    private String ghiChu;
    private NgayThangNam ngayHetHan;
    private double mucGiamGia;
    private double soTienConNo;

    // Constructor
    public HoaDonThanhToan(String maHoaDon, String maHocVien, String maLopHoc, String maChuongTrinhKhuyenMai, 
                           NgayThangNam ngayPhatHanh, String tinhTrang, double tongTien, 
                           String phuongThucThanhToan, NgayThangNam ngayThanhToan, double soTienThanhToan, 
                           String ghiChu, NgayThangNam ngayHetHan, 
                           double mucGiamGia, double soTienConNo) {
        this.maHoaDon = maHoaDon;
        this.maHocVien = maHocVien;
        this.maLopHoc = maLopHoc;
        this.maChuongTrinhKhuyenMai = maChuongTrinhKhuyenMai;
        this.ngayPhatHanh = ngayPhatHanh;
        this.tinhTrang = tinhTrang;
        this.tongTien = tongTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.soTienThanhToan = soTienThanhToan;
        this.ghiChu = ghiChu;
        this.ngayHetHan = ngayHetHan;
        this.mucGiamGia = mucGiamGia;
        this.soTienConNo = soTienConNo;
    }

    // Getters and Setters
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getMaChuongTrinhKhuyenMai() {
        return maChuongTrinhKhuyenMai;
    }

    public void setMaChuongTrinhKhuyenMai(String maChuongTrinhKhuyenMai) {
        this.maChuongTrinhKhuyenMai = maChuongTrinhKhuyenMai;
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

    public double getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public double getSoTienConNo() {
        return soTienConNo;
    }

    public void setSoTienConNo(double soTienConNo) {
        this.soTienConNo = soTienConNo;
    }
}
