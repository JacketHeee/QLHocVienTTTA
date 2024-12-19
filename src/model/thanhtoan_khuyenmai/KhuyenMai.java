package model.thanhtoan_khuyenmai;

import model.person.*;
import model.user.HocVien;

public class KhuyenMai {
    private HocVien hocVien;
    private String maKhuyenMai;
    private String tenKhuyenMai;
    private String moTa;
    private double giamGia; // Giá trị giảm giá (Ví dụ:  15%)
    private NgayThangNam ngayBatDau;
    private NgayThangNam ngayKetThuc;
    public HocVien getHocVien() {
        return hocVien;
    }
    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }
    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }
    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }
    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }
    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public NgayThangNam getNgayBatDau() {
        return ngayBatDau;
    }
    public void setNgayBatDau(NgayThangNam ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    public NgayThangNam getNgayKetThuc() {
        return ngayKetThuc;
    }
    public void setNgayKetThuc(NgayThangNam ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    // Constructor

}
