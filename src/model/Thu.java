package model;

public class Thu {
    private String maThu;       // Mã thứ (1 - 7, tương ứng Thứ 2 - Thứ 7)
    private String tenThu;   // Tên thứ (Thứ 2, Thứ 3, ...)

    public Thu(String maThu, String tenThu) {
        this.maThu = maThu;
        this.tenThu = tenThu;
    }

    public String getMaThu() {
        return maThu;
    }

    public void setMaThu(String maThu) {
        this.maThu = maThu;
    }

    public String getTenThu() {
        return tenThu;
    }

    public void setTenThu(String tenThu) {
        this.tenThu = tenThu;
    }
}

