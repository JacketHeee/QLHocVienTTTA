package model.theoDoi;

import model.person.*;
import model.user.HocVien;
public class YeuCauTuVan {
    private String maYeuCau;   
    private HocVien hocVien;        
    private String hoTen;  
    private String sdt;  
    private String email;
    private String mucTieu;         
    private NgayThangNam ngayDangKy;        
    private String trangThai;

    public YeuCauTuVan(String maYeuCau, HocVien hocVien, String hoTen, String sdt, String email, String mucTieu,
            NgayThangNam ngayDangKy, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.hocVien = hocVien;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
        this.mucTieu = mucTieu;
        this.ngayDangKy = ngayDangKy;
        this.trangThai = trangThai;
    }

    public String getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(String maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public HocVien getHocVien() {
        return hocVien;
    }

    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
