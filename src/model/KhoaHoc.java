package model;

import java.util.ArrayList;

public class KhoaHoc {
    private String maKhoaHoc;
    private CapBac capBac;
    private String tenKhoaHoc;
    private String moTa;
    private String noiDung;
    private double hocPhi;
    private ArrayList<LopHoc> lopHocs;

    public KhoaHoc(String maKhoaHoc, CapBac capBac, String tenKhoaHoc, String moTa, String noiDung, double hocPhi) {
        this.maKhoaHoc = maKhoaHoc;
        this.capBac = capBac;
        this.tenKhoaHoc = tenKhoaHoc;
        this.moTa = moTa;
        this.noiDung = noiDung;
        this.hocPhi = hocPhi;
    }

    // Getter and Setter methods
    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public CapBac getcapBac() {
        return capBac;
    }

    public void setcapBac(CapBac capBac) {
        this.capBac = capBac;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }
}
