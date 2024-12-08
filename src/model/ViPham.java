package model;

public class ViPham {
    private String maViPham;
    private HocVien hocVien;
    private String lyDo;
    private String ketQua; // Ví dụ: "Đình chỉ", "Cảnh cáo", ...

    // Constructor
    public ViPham(String maViPham, HocVien hocVien, String lyDo, String ketQua) {
        this.maViPham = maViPham;
        this.hocVien = hocVien;
        this.lyDo = lyDo;
        this.ketQua = ketQua;
    }

    // Getters and Setters
    public String getMaViPham() {
        return maViPham;
    }

    public void setMaViPham(String maViPham) {
        this.maViPham = maViPham;
    }

    public HocVien gethocVien() {
        return hocVien;
    }

    public void sethocVien(HocVien hocVien) {
        this.hocVien = hocVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    // Optional: You can add other methods for handling logic related to violations.
    public void prStringDetails() {
        System.out.println("Mã vi phạm: " + maViPham);
        System.out.println("Mã học viên: " + hocVien);
        System.out.println("Lý do: " + lyDo);
        System.out.println("Kết quả: " + ketQua);
    }
}

