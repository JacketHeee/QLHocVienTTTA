package model.user;
import model.khoahoc.LopHoc;
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
    public GiaoVien() {
        super();
        this.maNguoiDung = new NguoiDung();
        this.lopHocs = new ArrayList<>();
    }
    public GiaoVien(String maGV, NguoiDung maNguoiDung, String trinhDo, String chuyenMon, String vaiTro, 
        String hoten, NgayThangNam ngaysinh, DiaChi noisinh, int gioitinh) {
        super(hoten,ngaysinh,noisinh,gioitinh);
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
    @Override
    public String toString() {
        return  "[maGV: " + maGV + ", maNguoiDung:" + maNguoiDung.getMaNguoiDung() + ", trinhDo: " + trinhDo + ", chuyenMon:"
                + chuyenMon + ", vaiTro:" + vaiTro + "]";
    }
    public String getTrinhDoChuyenMon() {
        return this.getHoten() + "\n\tTrinh do: "+ this.trinhDo + "\n\tChuyen: " + this.chuyenMon;
    }
    public void show () {
        System.out.println(this.toString());
        super.show();
        System.out.println();
    }

    

    // Other methods as needed
}


