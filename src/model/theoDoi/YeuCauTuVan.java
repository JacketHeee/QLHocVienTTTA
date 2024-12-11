package model.theoDoi;

import model.person.*;
import model.user.HocVien;
public class YeuCauTuVan {
    private String maYeuCau;           // Mã yêu cầu tư vấn
    private HocVien hocVien;          // Mã học viên (khóa ngoại từ bảng HocVien)
    private String mucTieu;         // Mục tiêu tư vấn của học viên
    private NgayThangNam ngayDangKy;        // Ngày đăng ký yêu cầu tư vấn
    private String trangThai;       // Trạng thái yêu cầu (ví dụ: 'Đang xử lý', 'Đã hoàn thành', 'Đã hủy')

    // Constructor
    public YeuCauTuVan(String maYeuCau, HocVien hocVien, String mucTieu, NgayThangNam ngayDangKy, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.hocVien = hocVien;
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

    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
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
