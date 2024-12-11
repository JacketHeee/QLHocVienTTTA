package model.lichhoc;


public class CaHoc {
    private String maCaHoc;            // Mã ca học
    private GioPhut gioBatDau;     // Giờ bắt đầu
    private GioPhut gioKetThuc;    // Giờ kết thúc

    public CaHoc() {
        this.gioBatDau = new GioPhut();
        this.gioKetThuc = new GioPhut();
    }
    
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

    @Override
    public String toString() {
        return "["+gioBatDau.getFormattedTime()+ " - " + gioKetThuc.getFormattedTime() + "]";
    }

    public void show() {
        System.out.println(this.toString());
    }

    
}

