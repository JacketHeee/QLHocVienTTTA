package model.user;
import java.util.ArrayList;
import model.khoahoc.LopHoc;
import model.person.CaNhan;
import model.person.DiaChi;
import model.person.NgayThangNam;
import model.thanhtoan_khuyenmai.HoaDonThanhToan;
public class HocVien extends CaNhan{
    private String maHocVien;
    private NguoiDung maNguoiDung;  // Đây có thể là tham chiếu đến đối tượng người dùng
    private ArrayList<LopHoc> lopHocs;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;

    public HocVien() {
        super();
        this.maNguoiDung = new NguoiDung();
        this.lopHocs = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
    }

    public HocVien(String maHocVien, NguoiDung maNguoiDung,String hoten, NgayThangNam ngaysinh, DiaChi noisinh, int gioitinh) {
        super(hoten,ngaysinh,noisinh,gioitinh);
        this.maHocVien = maHocVien;
        this.maNguoiDung = maNguoiDung;
        this.lopHocs = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
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

    public void show() {
        System.out.println(this.maHocVien); 
        this.maNguoiDung.printInfo();
        System.out.println(this.getHoten());
        this.getNgaysinh().show();
        this.getNoisinh().show(); 
        System.out.println("\n"+this.getGioitinh());
    }
    // Other methods as needed
}

