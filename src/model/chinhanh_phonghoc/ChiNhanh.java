package model.chinhanh_phonghoc;

import java.util.ArrayList;

import model.person.DiaChi;

public class ChiNhanh {
    private String maChiNhanh;
    private String tenChiNhanh;
    private DiaChi diaChi;
    private String soDienThoai;
    private ArrayList<PhongHoc> phongHocs;

    public ChiNhanh() {
        this.diaChi = new DiaChi();
        this.phongHocs = new ArrayList<>();
    }

    public ChiNhanh(String maChiNhanh, String tenChiNhanh, DiaChi diaChi, String soDienThoai) {
        this.maChiNhanh = maChiNhanh;
        this.tenChiNhanh = tenChiNhanh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    // Getter and Setter methods
    public String getMaChiNhanh() {
        return maChiNhanh;
    }

    public void setMaChiNhanh(String maChiNhanh) {
        this.maChiNhanh = maChiNhanh;
    }

    public String getTenChiNhanh() {
        return tenChiNhanh;
    }

    public void setTenChiNhanh(String tenChiNhanh) {
        this.tenChiNhanh = tenChiNhanh;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ma chi nhanh: ").append(maChiNhanh).append("\n");
        sb.append("Ten chi nhanh: ").append(tenChiNhanh).append("\n");
        sb.append("Đia chi: ").append(diaChi.getInfor()).append("\n");
        sb.append("Sdt: ").append(soDienThoai).append("\n");
        return sb.toString();
    }
    public void show() {
        System.out.println(this.toString());
    }
}


