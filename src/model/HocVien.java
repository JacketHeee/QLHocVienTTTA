package model;
import java.util.ArrayList;
public class HocVien {
    private String maHocVien;
    private NguoiDung maNguoiDung;  // Đây có thể là tham chiếu đến đối tượng người dùng
    private ArrayList<LopHoc> lopHocs;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;
    // Constructor
    public HocVien() {}

    public HocVien(String maHocVien, NguoiDung maNguoiDung) {
        this.maHocVien = maHocVien;
        this.maNguoiDung = maNguoiDung;
    }

    // Getters and Setters
    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public NguoiDung getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDung maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    // Other methods as needed
}

