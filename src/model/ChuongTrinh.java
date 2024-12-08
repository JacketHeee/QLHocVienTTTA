package model;

public class ChuongTrinh {
    private int maChuongTrinh;
    private String tenChuongTrinh;
    private String doiTuong;

    // Constructor
    public ChuongTrinh(int maChuongTrinh, String tenChuongTrinh, String doiTuong) {
        this.maChuongTrinh = maChuongTrinh;
        this.tenChuongTrinh = tenChuongTrinh;
        this.doiTuong = doiTuong;
    }

    // Getters and Setters
    public int getMaChuongTrinh() {
        return maChuongTrinh;
    }

    public void setMaChuongTrinh(int maChuongTrinh) {
        this.maChuongTrinh = maChuongTrinh;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    // Other methods as needed
}

