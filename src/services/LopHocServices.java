package services;

import java.util.ArrayList;

import database.khoahoc.LopHocDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;

public class LopHocServices {
    private LopHocDB lopHocDB; 

    public LopHocServices() {
        lopHocDB = new LopHocDB();
    }

    public void displayAllLopHoc() {
        for (LopHoc x : lopHocDB.getlistLopHoc())
            x.show();
    }

    public static void main(String[] args) {
        LopHocDB lopHocDB = new LopHocDB();
        for (LopHoc x : lopHocDB.getLopHoctheoIDKhoaHoc("kh01"))  
            x.show();
    }
}
