package model;

public class TheoDoiHocTap {
    private HocVien hocVien;
    private LopHoc lopHoc;
    private String trangThai; // 'Đang học', 'Đã hoàn thành', 'Bỏ học'
    private double diemGiuaKy;
    private double diemCuoiKy;
    private double tongDiem; // Tổng điểm (0.4 * diemGiuaKy + 0.6 * diemCuoiKy)
    private String nhanXet;
    
    // Constructor
    public TheoDoiHocTap(HocVien hocVien, LopHoc lopHoc, String trangThai, double diemGiuaKy, 
                          double diemCuoiKy, String nhanXet) {
        this.hocVien = hocVien;
        this.lopHoc = lopHoc;
        this.trangThai = trangThai;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Tính tổng điểm
        this.nhanXet = nhanXet;
    }

    // Getters and Setters
    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public LopHoc getlopHoc() {
        return lopHoc;
    }

    public void setlopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public void setDiemGiuaKy(double diemGiuaKy) {
        this.diemGiuaKy = diemGiuaKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Cập nhật tổng điểm
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = 0.4f * diemGiuaKy + 0.6f * diemCuoiKy; // Cập nhật tổng điểm
    }

    public double getTongDiem() {
        return tongDiem;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }
}

