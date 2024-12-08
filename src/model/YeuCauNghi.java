package model;

import model.person.*;

public class YeuCauNghi {
    private String maYeuCau;
    private String maHocVien;
    private String maLopHoc;
    private String lyDoNghi;
    private NgayThangNam ngayYeuCau;
    private NgayThangNam ngayBatDauNghi;
    private NgayThangNam ngayDuKienQuayLai;
    private String trangThai; // ChuaDuyet, DaDuyet, TuChoi

    // Constructor
    public YeuCauNghi(String maYeuCau, String maHocVien, String maLopHoc, String lyDoNghi, NgayThangNam ngayYeuCau,
                      NgayThangNam ngayBatDauNghi, NgayThangNam ngayDuKienQuayLai, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.maHocVien = maHocVien;
        this.maLopHoc = maLopHoc;
        this.lyDoNghi = lyDoNghi;
        this.ngayYeuCau = ngayYeuCau;
        this.ngayBatDauNghi = ngayBatDauNghi;
        this.ngayDuKienQuayLai = ngayDuKienQuayLai;
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

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getLyDoNghi() {
        return lyDoNghi;
    }

    public void setLyDoNghi(String lyDoNghi) {
        this.lyDoNghi = lyDoNghi;
    }

    public NgayThangNam getNgayYeuCau() {
        return ngayYeuCau;
    }

    public void setNgayYeuCau(NgayThangNam ngayYeuCau) {
        this.ngayYeuCau = ngayYeuCau;
    }

    public NgayThangNam getNgayBatDauNghi() {
        return ngayBatDauNghi;
    }

    public void setNgayBatDauNghi(NgayThangNam ngayBatDauNghi) {
        this.ngayBatDauNghi = ngayBatDauNghi;
    }

    public NgayThangNam getNgayDuKienQuayLai() {
        return ngayDuKienQuayLai;
    }

    public void setNgayDuKienQuayLai(NgayThangNam ngayDuKienQuayLai) {
        this.ngayDuKienQuayLai = ngayDuKienQuayLai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}

