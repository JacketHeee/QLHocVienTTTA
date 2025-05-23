package model.lichhoc;
import java.util.ArrayList;

import model.khoahoc.LopHoc;
public class GioHoc {
    private String maTKB;            // Mã thời khóa biểu
    private CaHoc caHoc;          // Liên kết với CaHoc (Mã Ca học)
    private Thu thu1;             // Liên kết với Thu (Thứ 1)
    private Thu thu2;             // Liên kết với Thu (Thứ 2, có thể là NULL)
    private String ghiChu;        // Ghi chú
    private ArrayList<LopHoc> lopHocs;

    public GioHoc() {
        this.caHoc = new CaHoc(); 
        this.thu1 = new Thu(); 
        this.thu2 = new Thu();
        this.lopHocs = new ArrayList<>();
    }
    
    public GioHoc(String maTKB, CaHoc caHoc, Thu thu1, Thu thu2, String ghiChu) {
        this.maTKB = maTKB;
        this.caHoc = caHoc;
        this.thu1 = thu1;
        this.thu2 = thu2;
        this.ghiChu = ghiChu;
    }

    public String getMaTKB() {
        return maTKB;
    }

    public void setMaTKB(String maTKB) {
        this.maTKB = maTKB;
    }

    public CaHoc getCaHoc() {
        return caHoc;
    }

    public void setCaHoc(CaHoc caHoc) {
        this.caHoc = caHoc;
    }

    public Thu getThu1() {
        return thu1;
    }

    public void setThu1(Thu thu1) {
        this.thu1 = thu1;
    }

    public Thu getThu2() {
        return thu2;
    }

    public void setThu2(Thu thu2) {
        this.thu2 = thu2;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return caHoc.toString() + ", " + thu1.getTenThu() + ", " + thu2.getTenThu()
                ;
    }

    public void show() {
        System.out.println(this.toString());
    }
    
}
