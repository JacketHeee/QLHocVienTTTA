package model;

import model.person.*;

public class YeuCauChuyenLop {
    private String maYeuCau;
    private HocVien hocVien;
    private LopHoc lopCu;
    private LopHoc lopMoi;
    private String lyDo;
    private String trangThai; // ChuaDuyet, Duyet, TuChoi
    private NgayThangNam ngayYeuCau;
    private NgayThangNam ngayXuLy;

    // Constructor
    public YeuCauChuyenLop(String maYeuCau, HocVien hocVien, LopHoc lopCu, LopHoc lopMoi, String lyDo, String trangThai,
                           NgayThangNam ngayYeuCau, NgayThangNam ngayXuLy) {
        this.maYeuCau = maYeuCau;
        this.hocVien = hocVien;
        this.lopCu = lopCu;
        this.lopMoi = lopMoi;
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

    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public LopHoc getlopCu() {
        return lopCu;
    }

    public void setlopCu(LopHoc lopCu) {
        this.lopCu = lopCu;
    }

    public LopHoc getlopMoi() {
        return lopMoi;
    }

    public void setlopMoi(LopHoc lopMoi) {
        this.lopMoi = lopMoi;
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

