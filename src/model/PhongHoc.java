package model;

public class PhongHoc {
    private String maPhong;
    private String tenPhong;
    private ChiNhanh chiNhanh;
    private int sucChua;
    private String trangThai;
    private String trangThietBi;

    public PhongHoc(String maPhong, String tenPhong, ChiNhanh chiNhanh, int sucChua, String trangThai, String trangThietBi) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.chiNhanh = chiNhanh;
        this.sucChua = sucChua;
        this.trangThai = trangThai;
        this.trangThietBi = trangThietBi;
    }

    // Getter and Setter methods
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public ChiNhanh getchiNhanh() {
        return chiNhanh;
    }

    public void setchiNhanh(ChiNhanh chiNhanh) {
        this.chiNhanh = chiNhanh;
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

