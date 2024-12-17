package services;

import java.util.ArrayList;

import database.khoahoc.LopHocDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import utils.Chuoi;

public class LopHocServices {
    private LopHocDB lopHocDB; 

    public LopHocServices() {
        lopHocDB = new LopHocDB();
    }
    public void displayList(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(90,'-')); 
        System.out.printf("%4s | %-20s | %-10s | %-10s | %-10s | %s\n",Chuoi.centerText("STT",4),
            Chuoi.centerText("Ten lop hoc", 20),Chuoi.centerText("Ngay KG",10),
        Chuoi.centerText("SL toi da", 10),Chuoi.centerText("SL hien co",10),
        "Trang thai");
        System.out.println(Chuoi.line(90,'-')); 
        int index = 1;
        for (LopHoc x : list) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforPre());
        System.out.println(Chuoi.line(90,'-')); 
        System.out.println(""); 
    }
    
    public void displayAllLopHoc() {
        displayList(lopHocDB.getlistLopHoc());
    }
      
    public static void main(String[] args) {
        LopHocServices lopHocServices = new LopHocServices();
        lopHocServices.displayAllLopHoc();
    }
        
}
