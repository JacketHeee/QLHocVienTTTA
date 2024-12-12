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
    private String trangThai;  // String để thay thế enum, ví dụ: "DangTuyenSinh", "NgungTuyenSinh"
    private GioHoc gioHoc;
    private ArrayList<HocVien> hocViens;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;
    // Constructor
    public LopHoc() {
        this.khoaHoc = new KhoaHoc(); 
        this.khoaKhaiGiang = new KhoaKhaiGiang(); 
        this.phongHoc = new PhongHoc(); 
        this.gvChinh = new GiaoVien();
        this.gvTroGiang = new GiaoVien();
        this.gioHoc = new GioHoc();
        this.hocViens = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
    }

    public LopHoc(String maLopHoc, String tenLopHoc, KhoaHoc khoaHoc, KhoaKhaiGiang khoaKhaiGiang, PhongHoc phongHoc,
                  GiaoVien gvChinh, GiaoVien gvTroGiang, int soLuongToiDa, String trangThai, GioHoc gioHoc) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.khoaHoc = khoaHoc;
        this.khoaKhaiGiang = khoaKhaiGiang;
        this.phongHoc = phongHoc;
        this.gvChinh = gvChinh;
        this.gvTroGiang = gvTroGiang;
        this.soLuongToiDa = soLuongToiDa;
        this.trangThai = trangThai;
        this.gioHoc = gioHoc;
        this.hocViens = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Ten lop: " + tenLopHoc + "\nKhoaHoc:" + khoaHoc.getTenKhoaHoc() + "\nKKG: "
                + khoaKhaiGiang.getTenKhoaKhaiGiang() + "\nPhongHoc: " + phongHoc.getTenPhong() + "\nGioHoc:" + gioHoc.toString() + "\nGvChinh: " + gvChinh.getTrinhDoChuyenMon() + "\nGvTroGiang: " + gvTroGiang.getTrinhDoChuyenMon()
                + "\nSoLuongToiDa:" + soLuongToiDa + "\nSo luong hien tai: " + this.hocViens.size() +"\nTrangThai:" + trangThai+ "\n";
    }
    
    public ArrayList<HocVien> getHocViens() {
        return hocViens;
    }

    public ArrayList<HoaDonThanhToan> getHoaDonThanhToans() {
        return hoaDonThanhToans;
    }

    public void show() {
        System.out.println(this.toString());
    }
    // Other methods as needed
    
}

