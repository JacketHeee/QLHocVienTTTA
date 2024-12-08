package model;

public class HocVien {
    private int maHocVien;
    private NguoiDung maNguoiDung;  // Đây có thể là tham chiếu đến đối tượng người dùng

    // Constructor
    public HocVien() {}
    
    public HocVien(int maHocVien, NguoiDung maNguoiDung) {
        this.maHocVien = maHocVien;
        this.maNguoiDung = maNguoiDung;
    }

    // Getters and Setters
    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
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

