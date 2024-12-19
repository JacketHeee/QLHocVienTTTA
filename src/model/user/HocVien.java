package model.user;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import model.khoahoc.LopHoc;
import model.person.CaNhan;
import model.person.DiaChi;
import model.person.NgayThangNam;
import model.thanhtoan_khuyenmai.HoaDonThanhToan;
import model.theoDoi.TheoDoiHocTap;
// import utils.Chuoi;
import utils.*;
public class HocVien extends CaNhan{
    private String maHocVien;
    private NguoiDung maNguoiDung;  // Đây có thể là tham chiếu đến đối tượng người dùng
    private ArrayList<LopHoc> lopHocs;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;
    private ArrayList<TheoDoiHocTap> theoDoiHocTaps;

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

    public ArrayList<LopHoc> getLopHocs() {
        return lopHocs;
    }

    public void setLopHocs(ArrayList<LopHoc> lopHocs) {
        this.lopHocs = lopHocs;
    }

    public ArrayList<HoaDonThanhToan> getHoaDonThanhToans() {
        return hoaDonThanhToans;
    }

    public void setHoaDonThanhToans(ArrayList<HoaDonThanhToan> hoaDonThanhToans) {
        this.hoaDonThanhToans = hoaDonThanhToans;
    }

    public void show() {
        System.out.println("=====================THONG TIN CA NHAN=================");
        System.out.printf("Ma hoc vien: \033[1m%s\033[0m\n",maHocVien);
        super.show();
        System.out.printf("So dien thoai: \033[1m%s\033[0m\n",maNguoiDung.getSoDienthoai());
        System.out.printf("Email: \033[1m%s\033[0m\n",maNguoiDung.getEmail());
        // System.out.printf("Khoa hoc cap nhat da hoan thanh: \033[1m%s\033[0m",)
        System.out.println("");
    }
    // Other methods as needed

    public ArrayList<TheoDoiHocTap> getTheoDoiHocTaps() {
        return theoDoiHocTaps;
    }

    public void setTheoDoiHocTaps(ArrayList<TheoDoiHocTap> theoDoiHocTaps) {
        this.theoDoiHocTaps = theoDoiHocTaps;
    }
    
}

