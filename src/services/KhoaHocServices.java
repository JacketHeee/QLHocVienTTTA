package services;

import database.khoahoc.KhoaHocDB;
import database.khoahoc.LopHocDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;

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

    public void displayAllKhoaHoc() {
        for (KhoaHoc x : khoaHocDB.getlistKhoaHoc()) 
            x.show();
    }

    public static void main(String[] args) {
        KhoaHocServices khoaHocServices = new KhoaHocServices(); 
        KhoaHocDB khoaHocDB = new KhoaHocDB(); 
        khoaHocDB.getKhoaHocById("kh02").show();
        khoaHocServices.displayLopHocTheoID("kh02");
        // khoaHocServices.displayAllKhoaHoc();
    }

}
