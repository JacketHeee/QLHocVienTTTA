package services;

import model.chinhanh_phonghoc.PhongHoc;
import database.chinhanh_phonghoc.PhongHocDB;

public class PhongHocServices {
     private PhongHocDB phongHocDB; 

    public PhongHocServices() {
        phongHocDB = new PhongHocDB();
    }

    public PhongHoc getPhongHocById(String id) {
        for (PhongHoc x : phongHocDB.getlistPhongHoc()) 
            if (x.getMaPhong().equals(id))
                return x;
        return null;
    }
}