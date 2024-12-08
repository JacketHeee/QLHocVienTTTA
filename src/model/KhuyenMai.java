package model;

import model.person.*;

public class KhuyenMai {
    private String maKhuyenMai;
    private String tenKhuyenMai;
    private String moTa;
    private double giamGia; // Giá trị giảm giá (Ví dụ: 15.0 cho 15%)
    private String dieuKien;
    private NgayThangNam ngayBatDau;
    private NgayThangNam ngayKetThuc;
    private String trangThai; // 'DangDienRa', 'KetThuc', 'ChuaDienRa'

    // Constructor
    public KhuyenMai(String maKhuyenMai, String tenKhuyenMai, String moTa, double giamGia, 
                     String dieuKien, NgayThangNam ngayBatDau, NgayThangNam ngayKetThuc, String trangThai) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.moTa = moTa;
        this.giamGia = giamGia;
        this.dieuKien = dieuKien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    // Getters and Setters
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

    public String getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(String dieuKien) {
        this.dieuKien = dieuKien;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
