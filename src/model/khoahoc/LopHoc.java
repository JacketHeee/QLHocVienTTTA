package model.khoahoc;

import model.chinhanh_phonghoc.PhongHoc;
import model.lichhoc.GioHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.thanhtoan_khuyenmai.HoaDonThanhToan;
import model.theoDoi.TheoDoiHocTap;
import model.user.GiaoVien;
import model.user.HocVien;
import utils.Chuoi;

import java.util.ArrayList;

import database.khoahoc.LopHocDB;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private KhoaHoc khoaHoc;
    private KhoaKhaiGiang khoaKhaiGiang;
    private PhongHoc phongHoc;
    private GiaoVien gvChinh;
    private GiaoVien gvTroGiang;
    private int soLuongToiDa;
    private String trangThai;  // String để thay thế enum, ví dụ: "DangTuyenSinh", "NgungTuyenSinh"
    private GioHoc gioHoc;
    private ArrayList<HocVien> hocViens;
    private ArrayList<HoaDonThanhToan> hoaDonThanhToans;
    private ArrayList<TheoDoiHocTap> theoDoiHocTaps;
    // Constructor
    public LopHoc() {
        this.khoaHoc = new KhoaHoc(); 
        this.khoaKhaiGiang = new KhoaKhaiGiang(); 
        this.phongHoc = new PhongHoc(); 
        this.gvChinh = new GiaoVien();
        this.gvTroGiang = new GiaoVien();
        this.gioHoc = new GioHoc();
        this.hocViens = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
        this.theoDoiHocTaps = new ArrayList<>();
    }

    public LopHoc(String maLopHoc, String tenLopHoc, KhoaHoc khoaHoc, KhoaKhaiGiang khoaKhaiGiang, PhongHoc phongHoc,
                  GiaoVien gvChinh, GiaoVien gvTroGiang, int soLuongToiDa, String trangThai, GioHoc gioHoc) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.khoaHoc = khoaHoc;
        this.khoaKhaiGiang = khoaKhaiGiang;
        this.phongHoc = phongHoc;
        this.gvChinh = gvChinh;
        this.gvTroGiang = gvTroGiang;
        this.soLuongToiDa = soLuongToiDa;
        this.trangThai = trangThai;
        this.gioHoc = gioHoc;
        this.hocViens = new ArrayList<>();
        this.hoaDonThanhToans = new ArrayList<>();
        this.theoDoiHocTaps = new ArrayList<>();
    }

    public ArrayList<TheoDoiHocTap> getTheoDoiHocTaps() {
        return theoDoiHocTaps;
    }

    public void setTheoDoiHocTaps(ArrayList<TheoDoiHocTap> theoDoiHocTaps) {
        this.theoDoiHocTaps = theoDoiHocTaps;
    }

    // Getters and Setters
    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public KhoaHoc getkhoaHoc() {
        return khoaHoc;
    }

    public void setkhoaHoc(KhoaHoc khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public KhoaKhaiGiang getkhoaKhaiGiang() {
        return khoaKhaiGiang;
    }

    public void setkhoaKhaiGiang(KhoaKhaiGiang khoaKhaiGiang) {
        this.khoaKhaiGiang = khoaKhaiGiang;
    }

    public PhongHoc getphongHoc() {
        return phongHoc;
    }

    public void setphongHoc(PhongHoc phongHoc) {
        this.phongHoc = phongHoc;
    }

    public GiaoVien getgvChinh() {
        return gvChinh;
    }

    public void setgvChinh(GiaoVien gvChinh) {
        this.gvChinh = gvChinh;
    }

    public GiaoVien getgvTroGiang() {
        return gvTroGiang;
    }

    public void setgvTroGiang(GiaoVien gvTroGiang) {
        this.gvTroGiang = gvTroGiang;
    }

    public int getSoLuongToiDa() {
        return soLuongToiDa;
    }

    public void setSoLuongToiDa(int soLuongToiDa) {
        this.soLuongToiDa = soLuongToiDa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public GioHoc getgioHoc() {
        return gioHoc;
    }

    public void setgioHoc(GioHoc gioHoc) {
        this.gioHoc = gioHoc;
    }

    @Override
    public String toString() {
        return "Ten lop: " + tenLopHoc + "\nKhoaHoc:" + khoaHoc.getTenKhoaHoc() + "\nKKG: "
                + khoaKhaiGiang.getTenKhoaKhaiGiang() + "\nPhongHoc: " + phongHoc.getTenPhong() + "\nGioHoc:" + gioHoc.toString() + "\nGvChinh: " + gvChinh.getTrinhDoChuyenMon() + "\nGvTroGiang: " + gvTroGiang.getTrinhDoChuyenMon()
                + "\nSoLuongToiDa:" + soLuongToiDa + "\nSo luong hien tai: " + this.hocViens.size() +"\nTrangThai:" + trangThai+ "\n";
    }
    
    public ArrayList<HocVien> getHocViens() {
        return hocViens;
    }

    public void setHocViens(ArrayList<HocVien> hocViens) {
        this.hocViens = hocViens;
    }

    public void setHoaDonThanhToans(ArrayList<HoaDonThanhToan> hoaDonThanhToans) {
        this.hoaDonThanhToans = hoaDonThanhToans;
    }

    public ArrayList<HoaDonThanhToan> getHoaDonThanhToans() {
        return hoaDonThanhToans;
    }

    public void show() {
        System.out.println(getInforPre());
    }

    public void showAllInfor() {
        System.out.println("============================THONG TIN CHI TIET LOP HOC===============================\n");
        System.out.printf("Ten lop: \033[1m%s \033[0m \n",tenLopHoc);
        System.out.println("Khoa hoc: " + khoaHoc.getTenKhoaHoc());
        System.out.println("Ngay khai giang: " + khoaKhaiGiang.getThoiGianBatDau().getInfor()); 
        System.out.println("Thoi luong: " + khoaHoc.getcapBac().getThoiLuongString());
        System.out.println("Phong: " + phongHoc.getTenPhong());
        System.out.println("Co so: " + phongHoc.getchiNhanh().getTenChiNhanh()+"\nDia chi: " +
        phongHoc.getchiNhanh().getDiaChi().toString());
        System.out.println("Giang vien: \n");
        System.out.println(Chuoi.line(80 ,'-'));
        System.out.printf("\033[1m%-40s | %-40s\033[0m\n",Chuoi.centerText(gvChinh.getHoten(), 40),Chuoi.centerText(gvTroGiang.getHoten(),40));
        System.out.printf("%-40s | %-40s\n",Chuoi.centerText(gvChinh.getTrinhDo(),40),Chuoi.centerText(gvTroGiang.getTrinhDo(),40));
        System.out.printf("%-40s | %-40s\n",Chuoi.centerText("CMon: "+gvChinh.getChuyenMon(),40),Chuoi.centerText("CMon: "+gvTroGiang.getChuyenMon(),40));
        System.out.printf("%-40s | %-40s\n",Chuoi.centerText(gvChinh.getVaiTro(),40),Chuoi.centerText(gvTroGiang.getVaiTro(),40));
        System.out.println(Chuoi.line(80 ,'-'));
        System.out.println();
        System.out.printf("Lich hoc: %s\n",gioHoc.toString());
        System.out.println("So luong toi da: " + soLuongToiDa);
        System.out.println("So luong hien tai: " + hocViens.size());
        System.out.println("Trang thai: " + trangThai);
        System.out.println("");
    }
    // Other methods as needed
    
    public void addHocVien(HocVien hv) {
        this.hocViens.add(hv);
    }

    public String getInforPre() {
        return String.format("%-20s | %-10s | %-10s | %-10s | %-35s | %s", khoaHoc.getTenKhoaHoc(), khoaKhaiGiang.getThoiGianBatDau().getInfor(), 
        Chuoi.centerText(soLuongToiDa+"", 10), Chuoi.centerText(hocViens.size()+"", 10),gioHoc.toString(),phongHoc.getchiNhanh().getTenChiNhanh());
    }

    public String getInforForHoaDon() {
        return String.format("%-5s | %-20s | %-20s | %-10s", maLopHoc, tenLopHoc, khoaHoc.getTenKhoaHoc(), khoaKhaiGiang.getThoiGianBatDau().getInfor() );  
    }

    public String getInforForThongKeTheoLop() {
        return String.format("%-5s | %-20s | %-20s | %-10s | %-10s | %-10s", maLopHoc, tenLopHoc, khoaHoc.getTenKhoaHoc(),
            khoaKhaiGiang.getThoiGianBatDau().getInfor(), Chuoi.centerText(hocViens.size()+"", 10),Chuoi.centerText(phongHoc.getSucChua()+"",10));  
    }

    public static ArrayList<LopHoc> displayListInHoaDon(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(71,'-')); 
        System.out.printf("%4s | %-5s | %-20s | %-20s | %-10s\n",Chuoi.centerText("STT",4),
        Chuoi.centerText("ID",5),Chuoi.centerText("Ten lop hoc", 20),Chuoi.centerText("Ten khoa hoc",20),
        Chuoi.centerText("Ngay KG", 10));
        System.out.println(Chuoi.line(71,'-')); 
        int index = 1;
        for (LopHoc x : list) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforForHoaDon());
        System.out.println(Chuoi.line(71,'-')); 
        return list;
    }

    public static ArrayList<LopHoc> displayListThongKeTheoLop(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(98,'-')); 
        System.out.printf("%4s | %-5s | %-20s | %-20s | %-10s | %-10s | %s\n",Chuoi.centerText("STT",4),
        Chuoi.centerText("ID",5),Chuoi.centerText("Ten lop hoc", 20),Chuoi.centerText("Ten khoa hoc",20),
        Chuoi.centerText("Ngay KG", 10), "SL hien co", "SL toi da");
        System.out.println(Chuoi.line(98,'-')); 
        int index = 1;
        for (LopHoc x : list) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforForThongKeTheoLop());
        System.out.println(Chuoi.line(98,'-')); 
        return list;
    }
    
    public static void main(String[] args) {
        LopHocDB lopHocDB = new LopHocDB(); 
        // System.err.println(lopHocDB.getLopHocById("LP005").getInforPre());
        displayListThongKeTheoLop(lopHocDB.getlistLopHoc());
    }
}   


