package model;

public class CapBac {
    private int maCapBac;
    private ChuongTrinh chuongTrinh;  // Association with ChuongTrinh class
    private String tenCapBac;
    private String thoiGianHoc;

    // Constructor
    public CapBac(int maCapBac, ChuongTrinh chuongTrinh, String tenCapBac, String thoiGianHoc) {
        this.maCapBac = maCapBac;
        this.chuongTrinh = chuongTrinh;
        this.tenCapBac = tenCapBac;
        this.thoiGianHoc = thoiGianHoc;
    }

    // Getters and Setters
    public int getMaCapBac() {
        return maCapBac;
    }

    public void setMaCapBac(int maCapBac) {
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

