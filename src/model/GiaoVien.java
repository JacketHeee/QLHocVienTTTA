package model;
import model.person.*;
import java.util.ArrayList;
public class GiaoVien extends CaNhan {
    private String maGV;
    private NguoiDung maNguoiDung;  // Email
    private String trinhDo;  // Trình độ
    private String chuyenMon;  // Chuyên môn
    private String vaiTro;  // Vai trò
    private ArrayList<LopHoc> lopHocs;

    // Constructor
    public GiaoVien(String maGV, NguoiDung maNguoiDung, String trinhDo, String chuyenMon, String vaiTro) {
        this.maGV = maGV;
        this.maNguoiDung = maNguoiDung;
        this.trinhDo = trinhDo;
        this.chuyenMon = chuyenMon;
        this.vaiTro = vaiTro;
    }

    // Getters and Setters
    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public NguoiDung getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDung maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    // Other methods as needed
}


