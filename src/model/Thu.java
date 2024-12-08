package model;

public class Thu {
    private int maThu;       // Mã thứ (1 - 7, tương ứng Thứ 2 - Thứ 7)
    private String tenThu;   // Tên thứ (Thứ 2, Thứ 3, ...)

    public Thu(int maThu, String tenThu) {
        this.maThu = maThu;
        this.tenThu = tenThu;
    }

    public int getMaThu() {
        return maThu;
    }

    public void setMaThu(int maThu) {
        this.maThu = maThu;
    }

    public String getTenThu() {
        return tenThu;
    }

    public void setTenThu(String tenThu) {
        this.tenThu = tenThu;
    }
}

