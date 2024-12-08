package model;

import java.util.ArrayList;

public class CapBac {
    private String maCapBac;
    private ChuongTrinh chuongTrinh;  // Association with ChuongTrinh class
    private String tenCapBac;
    private String thoiGianHoc;
    private ArrayList<KhoaHoc> khoaHocs;
    // Constructor
    public CapBac(String maCapBac, ChuongTrinh chuongTrinh, String tenCapBac, String thoiGianHoc) {
        this.maCapBac = maCapBac;
        this.chuongTrinh = chuongTrinh;
        this.tenCapBac = tenCapBac;
        this.thoiGianHoc = thoiGianHoc;
    }

    // Getters and Setters
    public String getMaCapBac() {
        return maCapBac;
    }

    public void setMaCapBac(String maCapBac) {
        this.maCapBac = maCapBac;
    }

    public ChuongTrinh getChuongTrinh() {
        return chuongTrinh;
    }

    public void setChuongTrinh(ChuongTrinh chuongTrinh) {
        this.chuongTrinh = chuongTrinh;
    }

    public String getTenCapBac() {
        return tenCapBac;
    }

    public void setTenCapBac(String tenCapBac) {
        this.tenCapBac = tenCapBac;
    }

    public String getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(String thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    // Other methods as needed
}

