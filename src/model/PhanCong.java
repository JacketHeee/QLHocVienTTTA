package model;

import model.person.NgayThangNam;

public class PhanCong {
    private String maPhanCong;          // Mã phân công (khóa chính, tự động tăng)
    private GiaoVien giaoVien;          // Mã giáo viên (khóa ngoại từ bảng GiaoVien)
    private String maYeuCau;            // Mã yêu cầu tư vấn (khóa ngoại từ bảng YeuCauTuVan)
    private NgayThangNam ngayPhongVan;       // Ngày phỏng vấn
    private String ketQua;           // Kết quả của buổi tư vấn
    private GioPhut gioPhongVan;        // Giờ phỏng vấn

    // Constructor
    public PhanCong(String maPhanCong, GiaoVien giaoVien, String maYeuCau, NgayThangNam ngayPhongVan, String ketQua, GioPhut gioPhongVan) {
        this.maPhanCong = maPhanCong;
        this.giaoVien = giaoVien;
        this.maYeuCau = maYeuCau;
        this.ngayPhongVan = ngayPhongVan;
        this.ketQua = ketQua;
        this.gioPhongVan = gioPhongVan;
    }

    // Getters and Setters
    public String getMaPhanCong() {
        return maPhanCong;
    }

    public void setMaPhanCong(String maPhanCong) {
        this.maPhanCong = maPhanCong;
    }

    public GiaoVien getgiaoVien() {
        return giaoVien;
    }

    public void setgiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public String getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(String maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public NgayThangNam getNgayPhongVan() {
        return ngayPhongVan;
    }

    public void setNgayPhongVan(NgayThangNam ngayPhongVan) {
        this.ngayPhongVan = ngayPhongVan;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public GioPhut getGioPhongVan() {
        return gioPhongVan;
    }

    public void setGioPhongVan(GioPhut gioPhongVan) {
        this.gioPhongVan = gioPhongVan;
    }
}

