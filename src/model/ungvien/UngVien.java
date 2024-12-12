package model.ungvien;

import model.khoahoc.KhoaHoc;

public class UngVien {
    private String maUngVien; 
    private String hoTenUngVien; 
    private String sdtUV; 
    private String emailUV; 
    private KhoaHoc khoahocquantam;

    public UngVien() {
        khoahocquantam = new KhoaHoc();
    }

    public UngVien(String maUngVien, String hoTenUngVien, String sdtUV, String emailUV, KhoaHoc khoahocquantam) {
        this.maUngVien = maUngVien;
        this.hoTenUngVien = hoTenUngVien;
        this.sdtUV = sdtUV;
        this.emailUV = emailUV;
        this.khoahocquantam = khoahocquantam;
    }

    public String getMaUngVien() {
        return maUngVien;
    }

    public void setMaUngVien(String maUngVien) {
        this.maUngVien = maUngVien;
    }

    public String getHoTenUngVien() {
        return hoTenUngVien;
    }

    public void setHoTenUngVien(String hoTenUngVien) {
        this.hoTenUngVien = hoTenUngVien;
    }

    public String getSdtUV() {
        return sdtUV;
    }

    public void setSdtUV(String sdtUV) {
        this.sdtUV = sdtUV;
    }

    public String getEmailUV() {
        return emailUV;
    }

    public void setEmailUV(String emailUV) {
        this.emailUV = emailUV;
    }

    public KhoaHoc getKhoahocquantam() {
        return khoahocquantam;
    }

    public void setKhoahocquantam(KhoaHoc khoahocquantam) {
        this.khoahocquantam = khoahocquantam;
    } 
    
}
