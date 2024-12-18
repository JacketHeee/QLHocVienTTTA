package services;

import java.util.ArrayList;
import java.util.Comparator;

import database.khoahoc.KhoaHocDB;
import database.khoahoc.LopHocDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import utils.Chuoi;

public class KhoaHocServices {
    private KhoaHocDB khoaHocDB; 

    public KhoaHocServices() {
        khoaHocDB = new KhoaHocDB();   
        LopHocDB lopHocDB = new LopHocDB();
        for (KhoaHoc x : khoaHocDB.getlistKhoaHoc()) 
            x.setLopHocs(lopHocDB.getLopHoctheoIDKhoaHoc(x.getMaKhoaHoc()));
    }

    public void displayLopHocTheoID(String id) {
        KhoaHoc kh = this.khoaHocDB.getKhoaHocById(id); 
        for (LopHoc x : kh.getLopHocs()) 
            x.show();
    }

    
    public ArrayList<KhoaHoc> timKiemTheoTen(String input) {
        ArrayList<KhoaHoc> list = new ArrayList<>();
        String [] listKey = input.split(" ");
        for (KhoaHoc x : khoaHocDB.getlistKhoaHoc()) {
            if (x.getTenKhoaHoc().toLowerCase().indexOf(input.toLowerCase()) != -1) 
            list.add(x);
        }
        return list;
    }
    
    public ArrayList<KhoaHoc> displayList(ArrayList<KhoaHoc> list) {
        System.out.println(Chuoi.line(120,'-')); 
        System.out.printf("%4s | %-25s | %-35s | %-20s | %-10s | %s\n",Chuoi.centerText("STT",4),Chuoi.centerText("Chuong trinh", 25),
        Chuoi.centerText("Cap Bac", 35),Chuoi.centerText("Khoa Hoc",20),
        Chuoi.centerText("Thoi gian",10),"Hoc Phi");
        System.out.println(Chuoi.line(120,'-')); 
        int index = 1;
        for (KhoaHoc x : list ) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.toString());
        System.out.println(Chuoi.line(120,'-')); 
        System.out.println(""); 
        return list;
    }

    public ArrayList<KhoaHoc> displayAllKhoaHoc() {
        return displayList(khoaHocDB.getlistKhoaHoc());
    }

    public ArrayList<KhoaHoc> displayAllKhoaHocTheoCapBac(String idCapBac) {
        return displayList(khoaHocDB.getListKhoaHocByIdCapBac(idCapBac));
    }

    public ArrayList<KhoaHoc> displayAllKhoaHocTheoChuongTrinh(String idChuongTrinh) {
        return displayList(khoaHocDB.getListKhoaHocByIdChuongTrinh(idChuongTrinh));
    }
    
    public static void main(String[] args) {
        KhoaHocServices khoaHocServices = new KhoaHocServices();
        for (KhoaHoc x : khoaHocServices.timKiemTheoTen("b")) 
            x.show();
    }

    public KhoaHocDB getKhoaHocDB() {
        return khoaHocDB;
    }

    // public KhoaHoc getKhoaHocCaoNhatDaHoanThanh(ArrayList<LopHoc> listKhoaHoc) {
    //     for (LopHoc x : listKhoaHoc)
    //         list.add(x.getkhoaHoc()); 
    //     list.sort(new Comparator<KhoaHoc>() {
    //         @Override
    //         public int compare(KhoaHoc hv1, KhoaHoc hv2) {
    //             return hv1.compareTo(hv2);
    //         }
    //     });
    // }

}
