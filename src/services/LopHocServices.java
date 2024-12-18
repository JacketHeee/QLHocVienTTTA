package services;

import java.util.ArrayList;

import database.khoahoc.LopHocDB;
import database.theoDoi.TheoDoiHocTapDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import utils.Chuoi;

public class LopHocServices {
    private LopHocDB lopHocDB; 

    public LopHocServices() {
        lopHocDB = new LopHocDB();
        TheoDoiHocTapDB theoDoiHocTapDB = new TheoDoiHocTapDB();
        for (LopHoc x : lopHocDB.getlistLopHoc())
            x.setHocViens(theoDoiHocTapDB.getHocVienTheoLopHoc(x.getMaLopHoc()));
    }
    public ArrayList<LopHoc> displayList(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(105,'-')); 
        System.out.printf("%4s | %-20s | %-10s | %-10s | %-10s | %-30s\n",Chuoi.centerText("STT",4),
            Chuoi.centerText("Ten khoa hoc", 20),Chuoi.centerText("Ngay KG",10),
        Chuoi.centerText("SL toi da", 10),Chuoi.centerText("SL hien co",10),
        Chuoi.centerText("Gio hoc",30));
        System.out.println(Chuoi.line(105,'-')); 
        int index = 1;
        for (LopHoc x : list) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforPre());
        System.out.println(Chuoi.line(105,'-')); 
        System.out.println(""); 
        return list;
    }
    
    public ArrayList<LopHoc> displayAllLopHoc() {
        return displayList(lopHocDB.getlistLopHoc());
    }

    public ArrayList<LopHoc> displayAllKhoaHocSapKhaiGiang() {
        return displayList(lopHocDB.getLopHocSapKhaiGiang());
    }

    public ArrayList<LopHoc> getKhoaHocSapKhaiGiang() {
        return lopHocDB.getLopHocSapKhaiGiang();
    }
      
    public static void main(String[] args) {
        LopHocServices lopHocServices = new LopHocServices();
        lopHocServices.displayAllLopHoc();
    }
        
}
