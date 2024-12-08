package model;

import model.person.*;
public class YeuCauTuVan {
    private String maYeuCau;           // Mã yêu cầu tư vấn
    private String maHocVien;          // Mã học viên (khóa ngoại từ bảng HocVien)
    private String mucTieu;         // Mục tiêu tư vấn của học viên
    private NgayThangNam ngayDangKy;        // Ngày đăng ký yêu cầu tư vấn
    private String trangThai;       // Trạng thái yêu cầu (ví dụ: 'Đang xử lý', 'Đã hoàn thành', 'Đã hủy')

    // Constructor
    public YeuCauTuVan(String maYeuCau, String maHocVien, String mucTieu, NgayThangNam ngayDangKy, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.maHocVien = maHocVien;
        this.mucTieu = mucTieu;
        this.ngayDangKy = ngayDangKy;
        this.trangThai = trangThai;
    }

    // Getters and Setters
    public String getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(String maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getMucTieu() {
        return mucTieu;
    }

    public void setMucTieu(String mucTieu) {
        this.mucTieu = mucTieu;
    }

    public NgayThangNam getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(NgayThangNam ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
