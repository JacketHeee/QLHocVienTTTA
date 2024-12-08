package model;

import java.util.Date;

public class KhoaKhaiGiang {
    private int maKhoaKhaiGiang;
    private String tenKhoaKhaiGiang;
    private int namHoc;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private String moTa;

    public KhoaKhaiGiang(int maKhoaKhaiGiang, String tenKhoaKhaiGiang, int namHoc, Date thoiGianBatDau, Date thoiGianKetThuc, String moTa) {
        this.maKhoaKhaiGiang = maKhoaKhaiGiang;
        this.tenKhoaKhaiGiang = tenKhoaKhaiGiang;
        this.namHoc = namHoc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.moTa = moTa;
    }

    // Getter and Setter methods
    public int getMaKhoaKhaiGiang() {
        return maKhoaKhaiGiang;
    }

    public void setMaKhoaKhaiGiang(int maKhoaKhaiGiang) {
        this.maKhoaKhaiGiang = maKhoaKhaiGiang;
    }

    public String getTenKhoaKhaiGiang() {
        return tenKhoaKhaiGiang;
    }

    public void setTenKhoaKhaiGiang(String tenKhoaKhaiGiang) {
        this.tenKhoaKhaiGiang = tenKhoaKhaiGiang;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}

