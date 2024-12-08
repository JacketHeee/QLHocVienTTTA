package model;

public class PhongHoc {
    private int maPhong;
    private String tenPhong;
    private int maChiNhanh;
    private int sucChua;
    private String trangThai;
    private String trangThietBi;

    public PhongHoc(int maPhong, String tenPhong, int maChiNhanh, int sucChua, String trangThai, String trangThietBi) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.maChiNhanh = maChiNhanh;
        this.sucChua = sucChua;
        this.trangThai = trangThai;
        this.trangThietBi = trangThietBi;
    }

    // Getter and Setter methods
    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(int maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getTrangThietBi() {
        return trangThietBi;
    }

    public void setTrangThietBi(String trangThietBi) {
        this.trangThietBi = trangThietBi;
    }
}

