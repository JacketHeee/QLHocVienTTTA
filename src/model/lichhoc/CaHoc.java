package model.lichhoc;


public class CaHoc {
    private String maCaHoc;            // Mã ca học
    private GioPhut gioBatDau;     // Giờ bắt đầu
    private GioPhut gioKetThuc;    // Giờ kết thúc

    public CaHoc(String maCaHoc, GioPhut gioBatDau, GioPhut gioKetThuc) {
        this.maCaHoc = maCaHoc;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public String getMaCaHoc() {
        return maCaHoc;
    }
    
    public void setMaCaHoc(String maCaHoc) {
        this.maCaHoc = maCaHoc;
    }

    public GioPhut getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(GioPhut gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public GioPhut getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(GioPhut gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }
}

