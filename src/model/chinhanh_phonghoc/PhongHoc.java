package model.chinhanh_phonghoc;

public class PhongHoc {
    private String maPhong;
    private String tenPhong;
    private ChiNhanh chiNhanh;
    private int sucChua;
    private String trangThai;
    private String trangThietBi;

    public PhongHoc() {
        this.chiNhanh = new ChiNhanh();
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ma Phong: ").append(maPhong).append("\n");
        sb.append("Ten Phong: ").append(tenPhong).append("\n");
        sb.append("Chi Nhanh: ").append(chiNhanh.toString()).append("\n");
        sb.append("Suc Chua: ").append(sucChua).append("\n");
        sb.append("Trang Thai: ").append(trangThai).append("\n");
        sb.append("Trang Thiet Bi: ").append(trangThietBi).append("\n");
        return sb.toString();
    }

    public void show() {
        System.out.println(this.toString());
    }

}

