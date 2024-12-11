package model.lichhoc;


import java.util.ArrayList;

import model.khoahoc.LopHoc;
import model.person.NgayThangNam;

public class KhoaKhaiGiang {
    private String maKhoaKhaiGiang;
    private String tenKhoaKhaiGiang;
    private int namHoc;
    private NgayThangNam thoiGianBatDau;
    private NgayThangNam thoiGianKetThuc; // 
    private String moTa;
    private ArrayList<LopHoc> lopHocs;

    public KhoaKhaiGiang() {
        this.thoiGianBatDau = new NgayThangNam(); 
        this.thoiGianKetThuc = new NgayThangNam();
        this.lopHocs = new ArrayList<>();
    }

    public KhoaKhaiGiang(String maKhoaKhaiGiang, String tenKhoaKhaiGiang, int namHoc, NgayThangNam thoiGianBatDau, NgayThangNam thoiGianKetThuc, String moTa) {
        this.maKhoaKhaiGiang = maKhoaKhaiGiang;
        this.tenKhoaKhaiGiang = tenKhoaKhaiGiang;
        this.namHoc = namHoc;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.moTa = moTa;
    }

    // Getter and Setter methods
    public String getMaKhoaKhaiGiang() {
        return maKhoaKhaiGiang;
    }

    public void setMaKhoaKhaiGiang(String maKhoaKhaiGiang) {
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

    public NgayThangNam getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(NgayThangNam thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public NgayThangNam getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(NgayThangNam thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "[" + tenKhoaKhaiGiang + ", namHoc=" + namHoc + ", "
                + thoiGianBatDau.getInfor() + "-" + thoiGianKetThuc.getInfor() + ", " + moTa + "]";
    }

    public void show() {
        System.out.println(this.toString());
    }
}

