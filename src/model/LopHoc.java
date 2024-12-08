package model;

import model.person.*;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private String maKhoaHoc;
    private String maKhoaKhaiGiang;
    private String maPhongHoc;
    private String maGVNhat;
    private String maGVTroGiang;
    private int soLuongToiDa;
    private NgayThangNam ngayKhaiGiang;
    private String trangThai;  // String để thay thế enum, ví dụ: "DangTuyenSinh", "NgungTuyenSinh"
    private String maGioHoc;

    // Constructor
    public LopHoc(String maLopHoc, String tenLopHoc, String maKhoaHoc, String maKhoaKhaiGiang, String maPhongHoc,
                  String maGVNhat, String maGVTroGiang, int soLuongToiDa, NgayThangNam ngayKhaiGiang, String trangThai, String maGioHoc) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.maKhoaHoc = maKhoaHoc;
        this.maKhoaKhaiGiang = maKhoaKhaiGiang;
        this.maPhongHoc = maPhongHoc;
        this.maGVNhat = maGVNhat;
        this.maGVTroGiang = maGVTroGiang;
        this.soLuongToiDa = soLuongToiDa;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.trangThai = trangThai;
        this.maGioHoc = maGioHoc;
    }

    // Getters and Setters
    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaKhoaKhaiGiang() {
        return maKhoaKhaiGiang;
    }

    public void setMaKhoaKhaiGiang(String maKhoaKhaiGiang) {
        this.maKhoaKhaiGiang = maKhoaKhaiGiang;
    }

    public String getMaPhongHoc() {
        return maPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        this.maPhongHoc = maPhongHoc;
    }

    public String getMaGVNhat() {
        return maGVNhat;
    }

    public void setMaGVNhat(String maGVNhat) {
        this.maGVNhat = maGVNhat;
    }

    public String getMaGVTroGiang() {
        return maGVTroGiang;
    }

    public void setMaGVTroGiang(String maGVTroGiang) {
        this.maGVTroGiang = maGVTroGiang;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public NgayThangNam getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(NgayThangNam ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getmaGioHoc() {
        return maGioHoc;
    }

    public void setmaGioHoc(String maGioHoc) {
        this.maGioHoc = maGioHoc;
    }

    // Other methods as needed
}

