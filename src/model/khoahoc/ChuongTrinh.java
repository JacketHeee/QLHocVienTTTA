package model.khoahoc;

import java.util.ArrayList;

public class ChuongTrinh {
    private String maChuongTrinh;
    private String tenChuongTrinh;
    private String doiTuong;
    private ArrayList<CapBac> capBacs;
    // Constructor
    public ChuongTrinh(String maChuongTrinh, String tenChuongTrinh, String doiTuong) {
        this.maChuongTrinh = maChuongTrinh;
        this.tenChuongTrinh = tenChuongTrinh;
        this.doiTuong = doiTuong;
    }

    // Getters and Setters
    public String getMaChuongTrinh() {
        return maChuongTrinh;
    }

    public void setMaChuongTrinh(String maChuongTrinh) {
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

