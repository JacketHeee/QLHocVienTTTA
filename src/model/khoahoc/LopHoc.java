package model.khoahoc;

import model.chinhanh_phonghoc.PhongHoc;
import model.lichhoc.GioHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.person.*;
import model.thanhtoan_khuyenmai.HoaDonThanhToan;
import model.user.GiaoVien;
import model.user.HocVien;

import java.util.ArrayList;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private KhoaHoc khoaHoc;
    private KhoaKhaiGiang khoaKhaiGiang;
    private PhongHoc phongHoc;
    private GiaoVien gvChinh;
    private GiaoVien gvTroGiang;
    private int soLuongToiDa;
    private NgayThangNam ngayKhaiGiang;
    private String trangThai;  // String để thay thế enum, ví dụ: "DangTuyenSinh", "NgungTuyenSinh"
    private GioHoc gioHoc;
    private ArrayList<HocVien> hocViens;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;
    // Constructor
    public LopHoc(String maLopHoc, String tenLopHoc, KhoaHoc khoaHoc, KhoaKhaiGiang khoaKhaiGiang, PhongHoc phongHoc,
                  GiaoVien gvChinh, GiaoVien gvTroGiang, int soLuongToiDa, NgayThangNam ngayKhaiGiang, String trangThai, GioHoc gioHoc) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.khoaHoc = khoaHoc;
        this.khoaKhaiGiang = khoaKhaiGiang;
        this.phongHoc = phongHoc;
        this.gvChinh = gvChinh;
        this.gvTroGiang = gvTroGiang;
        this.soLuongToiDa = soLuongToiDa;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.trangThai = trangThai;
        this.gioHoc = gioHoc;
    }

    // Getters and Setters
    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public KhoaHoc getkhoaHoc() {
        return khoaHoc;
    }

    public void setkhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public KhoaKhaiGiang getkhoaKhaiGiang() {
        return khoaKhaiGiang;
    }

    public void setkhoaKhaiGiang(KhoaKhaiGiang khoaKhaiGiang) {
        this.khoaKhaiGiang = khoaKhaiGiang;
    }

    public PhongHoc getphongHoc() {
        return phongHoc;
    }

    public void setphongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
    }

    public GiaoVien getgvChinh() {
        return gvChinh;
    }

    public void setgvChinh(GiaoVien gvChinh) {
        this.gvChinh = gvChinh;
    }

    public GiaoVien getgvTroGiang() {
        return gvTroGiang;
    }

    public void setgvTroGiang(GiaoVien gvTroGiang) {
        this.gvTroGiang = gvTroGiang;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public NgayThangNam getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(NgayThangNam ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public GioHoc getgioHoc() {
        return gioHoc;
    }

    public void setgioHoc(GioHoc gioHoc) {
        this.gioHoc = gioHoc;
    }

    // Other methods as needed
}

