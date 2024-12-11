package model.khoahoc;

import java.util.ArrayList;

public class CapBac {
    private String maCapBac;
    private ChuongTrinh chuongTrinh;  // Association with ChuongTrinh class
    private String tenCapBac;
    private int thoiGianHoc;
    private ArrayList<KhoaHoc> khoaHocs;
    // Constructor
    public CapBac(String maCapBac, ChuongTrinh chuongTrinh, String tenCapBac, int thoiGianHoc) {
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

    public int getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(int thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    // Other methods as needed
}

