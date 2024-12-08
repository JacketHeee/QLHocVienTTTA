package model;

public class HocVien_LopHoc {
    private String maHocVien;
    private String maLopHoc;
    private String trangThai; // 'Đang học', 'Đã hoàn thành', 'Bỏ học'
    private float diemGiuaKy;
    private float diemCuoiKy;
    private float tongDiem; // Tổng điểm (0.4 * diemGiuaKy + 0.6 * diemCuoiKy)
    private String nhanXet;

    // Constructor
    public HocVien_LopHoc(String maHocVien, String maLopHoc, String trangThai, float diemGiuaKy, 
                          float diemCuoiKy, String nhanXet) {
        this.maHocVien = maHocVien;
        this.maLopHoc = maLopHoc;
        this.trangThai = trangThai;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Tính tổng điểm
        this.nhanXet = nhanXet;
    }

    // Getters and Setters
    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public float getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(float diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Cập nhật tổng điểm
    }

    public float getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(float diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Cập nhật tổng điểm
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }
}

