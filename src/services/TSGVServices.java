package services;
import java.util.*;

import database.users.HocVienDB;
import model.khoahoc.*;
import model.user.HocVien;
import utils.Chuoi;
public class TSGVServices {
    private KhoaHocServices khoaHocServices; 
    private LopHocServices lopHocServices; 
    private HocVienServices hocVienServices;
    private GiaoVienServices giaoVienServices;
    private TheoDoiHocTapServices theoDoiHocTapServices;
    private CapBacServices capBacServices;

    public TSGVServices(KhoaHocServices khoaHocServices, LopHocServices lopHocServices) {
        this.khoaHocServices = khoaHocServices;
        this.lopHocServices = lopHocServices;
        hocVienServices = new HocVienServices();
        giaoVienServices = new GiaoVienServices();
        theoDoiHocTapServices = new TheoDoiHocTapServices();
        capBacServices = new CapBacServices();
        capBacServices.themKhoaHocVaoCapbac(khoaHocServices);
    }

    public ArrayList<CapBac> getlistCapBac() {
        return capBacServices.getlistCapBac();
    }

    public void displayListHocVienTheoKhoaHoc(ArrayList<CapBac> list) {
        System.out.printf("%-90s\n\n",Chuoi.centerText("______====== THONG KE HOC VIEN THEO TUNG KHOA HOC VA TRINH DO ======______", 90));
        System.out.println(Chuoi.line(90,'-'));
        System.out.printf(" %-21s | %-4s | %-20s | %-10s | %s\n",Chuoi.centerText("Cap bac", 21),Chuoi.centerText("ID",4),Chuoi.centerText("Ten khoa hoc",20),
        Chuoi.centerText("Hoc phi",10), "So luong hoc vien" );
        System.out.println(Chuoi.line(90,'-'));
        for (CapBac x: list) {
            x.showForThongKeTheoTrinhDo();
            System.out.println(Chuoi.line(90,'-'));
        }
    }

    public ArrayList<HocVien> timKiemHocVien(String input) {
        String[] keys = input.split(" ");
        ArrayList<HocVien> list = new ArrayList<>(); 
        HocVienDB hocVienDB = new HocVienDB();
        for (HocVien x : hocVienServices.getListHocVien())
        // for (HocVien x : hocVienDB.getListHocVien())
            if (x.getMaHocVien().equals(input) || Chuoi.isTontai(keys, x.getHoten())) 
                list.add(x);
        return list; 
    }

    public ArrayList<LopHoc> displayAllLopHoc() {
        return lopHocServices.displayList(lopHocServices.getlistLopHoc());
    }

    public static void main(String[] args) {
        TSGVServices tsgvServices = new TSGVServices(null, null); 
        for (HocVien x : tsgvServices.timKiemHocVien("m"))   
            x.show();
    }


}
