package model;

import model.person.*;

public class YeuCauChuyenLop {
    private String maYeuCau;
    private String maHocVien;
    private String maLopCu;
    private String maLopMoi;
    private String lyDo;
    private String trangThai; // ChuaDuyet, Duyet, TuChoi
    private NgayThangNam ngayYeuCau;
    private NgayThangNam ngayXuLy;

    // Constructor
    public YeuCauChuyenLop(String maYeuCau, String maHocVien, String maLopCu, String maLopMoi, String lyDo, String trangThai,
                           NgayThangNam ngayYeuCau, NgayThangNam ngayXuLy) {
        this.maYeuCau = maYeuCau;
        this.maHocVien = maHocVien;
        this.maLopCu = maLopCu;
        this.maLopMoi = maLopMoi;
        this.lyDo = lyDo;
        this.trangThai = trangThai;
        this.ngayYeuCau = ngayYeuCau;
        this.ngayXuLy = ngayXuLy;
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

    public String getMaLopCu() {
        return maLopCu;
    }

    public void setMaLopCu(String maLopCu) {
        this.maLopCu = maLopCu;
    }

    public String getMaLopMoi() {
        return maLopMoi;
    }

    public void setMaLopMoi(String maLopMoi) {
        this.maLopMoi = maLopMoi;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public NgayThangNam getNgayYeuCau() {
        return ngayYeuCau;
    }

    public void setNgayYeuCau(NgayThangNam ngayYeuCau) {
        this.ngayYeuCau = ngayYeuCau;
    }

    public NgayThangNam getNgayXuLy() {
        return ngayXuLy;
    }

    public void setNgayXuLy(NgayThangNam ngayXuLy) {
        this.ngayXuLy = ngayXuLy;
    }
}

