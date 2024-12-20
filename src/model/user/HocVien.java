package model.user;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import database.users.HocVienDB;
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

    public HocVien(String hoten) {
        super(hoten);
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

    // Other methods as needed
    
    public ArrayList<TheoDoiHocTap> getTheoDoiHocTaps() {
        return theoDoiHocTaps;
    }
    
    public void setTheoDoiHocTaps(ArrayList<TheoDoiHocTap> theoDoiHocTaps) {
        this.theoDoiHocTaps = theoDoiHocTaps;
    }

    public boolean isNewHocVien() {
        return (getGioitinh() == -1);
    }
    
    public boolean addLopHoc(LopHoc lopHoc) {
        lopHocs.add(lopHoc);
        return true;
    }
    
    public boolean addHoaDon(HoaDonThanhToan hoadon) {
        hoaDonThanhToans.add(hoadon);
        return true;
    }
    
    public boolean addTheoDoi(TheoDoiHocTap theodoi) {
        theoDoiHocTaps.add(theodoi);
        return true;
    }
    
    public String lineInSearch() {
        return String.format("%-11s | %-20s | %-10s | %s",Chuoi.centerText(maHocVien, 11), getHoten(), 
            maNguoiDung.getSoDienthoai(),maNguoiDung.getEmail());
        }
        
        public static void displayList(ArrayList<HocVien> list) {
            System.out.println(Chuoi.line(80, '-'));
            System.out.printf(" %-4s | %-11s | %-20s | %-10s | %s\n", Chuoi.centerText("STT", 4), Chuoi.centerText("Ma hoc vien",11), 
            Chuoi.centerText("Ho va ten",20), Chuoi.centerText("SDT",10), Chuoi.centerText("Email", 15));
            System.out.println(Chuoi.line(80, '-'));
            int index = 1; 
            for (HocVien x : list) { 
            System.out.printf(" %-4s | %s\n",Chuoi.centerText(index++ + "", 4), x.lineInSearch());
        }
        System.out.println(Chuoi.line(80, '-'));
        System.out.println("");
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
    public void xemHoSo() {
        System.out.printf("%-71s\n",Chuoi.centerText("=====================THONG TIN CA NHAN=================", 71));
        System.out.printf("Ma hoc vien: \033[1m%s\033[0m\n",maHocVien);
        super.show();
        System.out.printf("So dien thoai: \033[1m%s\033[0m\n",maNguoiDung.getSoDienthoai());
        System.out.printf("Email: \033[1m%s\033[0m\n",maNguoiDung.getEmail());
        // System.out.printf("Khoa hoc cap nhat da hoan thanh: \033[1m%s\033[0m",)
        System.out.println("");
        // System.out.println("==================KHOA HOC DA THAM GIA=================");
        ArrayList<LopHoc> lopdanghocs = new ArrayList<>();
        ArrayList<LopHoc> lopchuahocs = new ArrayList<>();
        for (TheoDoiHocTap x : theoDoiHocTaps) {
            if (x.getTrangThai().equals("Dang hoc"))    
                lopdanghocs.add(x.getLopHoc());
            else 
            if (x.getTrangThai().equals("Chua hoc"))
                lopchuahocs.add(x.getLopHoc());
        }
        System.out.println("\033[1;4mCac lop dang hoc:\033[0m");
        if (lopdanghocs.size() == 0) {
            System.out.println("* Khong co lop");
        }
        else 
            LopHoc.displayListInHoaDon(lopdanghocs);
        ///////////////////////////
        System.out.println("\033[1;4mCac lop chua hoc:\033[0m");
        if (lopchuahocs.size() == 0) {
            System.out.println("*Khong co lop");
        }
        else 
            LopHoc.displayListInHoaDon(lopchuahocs);
        System.out.println("");
    }
    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB(); 
        for (HocVien x : hocVienDB.getListHocVien())    
            x.xemHoSo();
    }
}

