package model.theoDoi;

import model.khoahoc.LopHoc;
import model.user.HocVien;
import utils.Chuoi;

public class TheoDoiHocTap {
    private String maTheoDoi;
    private HocVien hocVien;
    private LopHoc lopHoc;
    private String trangThai; // 'Đang học', 'Đã hoàn thành', 'Bỏ học',
    private double diemGiuaKy;
    private double diemCuoiKy;
    private double tongDiem; // Tổng điểm (0.4 * diemGiuaKy + 0.6 * diemCuoiKy)
    private String nhanXet;
    public TheoDoiHocTap(String maTheoDoi, HocVien hocVien, LopHoc lopHoc, String trangThai, double diemGiuaKy,
            double diemCuoiKy, double tongDiem, String nhanXet) {
        this.maTheoDoi = maTheoDoi;
        this.hocVien = hocVien;
        this.lopHoc = lopHoc;
        this.trangThai = trangThai;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
        this.tongDiem = tongDiem;
        this.nhanXet = nhanXet;
    }
    public String getMaTheoDoi() {
        return maTheoDoi;
    }
    public void setMaTheoDoi(String maTheoDoi) {
        this.maTheoDoi = maTheoDoi;
    }
    public HocVien getHocVien() {
        return hocVien;
    }
    public void setHocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }
    public LopHoc getLopHoc() {
        return lopHoc;
    }
    public void setLopHoc(LopHoc lopHoc) {
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
    }
    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }
    public void setDiemCuoiKy(double diemCuoiKy) {
        this.diemCuoiKy = diemCuoiKy;
    }
    public double getTongDiem() {
        return tongDiem;
    }
    public void setTongDiem(double tongDiem) {
        this.tongDiem = tongDiem;
    }
    public String getNhanXet() {
        return nhanXet;
    }
    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }
    @Override
    public String toString() {
        return String.format("%-4s | %-15s | %-5s | %-8s | %-8s | %-8s | %-20s", 
            Chuoi.centerText(lopHoc.getkhoaHoc().getMaKhoaHoc(), 4),lopHoc.getkhoaHoc().getTenKhoaHoc(),
            Chuoi.centerText(lopHoc.getMaLopHoc(),4), Chuoi.centerText(diemGiuaKy+"",8),Chuoi.centerText(diemCuoiKy+"",8),
            Chuoi.centerText(tongDiem+"",8),trangThai);
    }
    // Constructor
    public void show() {
        System.out.println(toString());
    }

}

