package model;

import model.person.*;

public class YeuCauNghi {
    private String maYeuCau;
    private HocVien hocVien;
    private String lyDoNghi;
    private NgayThangNam ngayYeuCau;
    private NgayThangNam ngayBatDauNghi;
    private NgayThangNam ngayDuKienQuayLai;
    private String trangThai; // ChuaDuyet, DaDuyet, TuChoi

    // Constructor
    public YeuCauNghi(String maYeuCau, HocVien hocVien, String lyDoNghi, NgayThangNam ngayYeuCau,
                      NgayThangNam ngayBatDauNghi, NgayThangNam ngayDuKienQuayLai, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.hocVien = hocVien;
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

    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
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

