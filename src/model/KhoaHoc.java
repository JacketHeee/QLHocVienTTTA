package model;

public class KhoaHoc {
    private int maKhoaHoc;
    private String maCapBac;
    private String tenKhoaHoc;
    private String moTa;
    private String noiDung;
    private double hocPhi;

    public KhoaHoc(int maKhoaHoc, String maCapBac, String tenKhoaHoc, String moTa, String noiDung, double hocPhi) {
        this.maKhoaHoc = maKhoaHoc;
        this.maCapBac = maCapBac;
        this.tenKhoaHoc = tenKhoaHoc;
        this.moTa = moTa;
        this.noiDung = noiDung;
        this.hocPhi = hocPhi;
    }

    // Getter and Setter methods
    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaCapBac() {
        return maCapBac;
    }

    public void setMaCapBac(String maCapBac) {
        this.maCapBac = maCapBac;
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
