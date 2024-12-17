package services;

import database.khoahoc.CapBacDB;
import database.khoahoc.KhoaHocDB;
import model.khoahoc.CapBac;

public class CapBacServices {
    private CapBacDB capBacDB; 

    public CapBacServices() {
        capBacDB = new CapBacDB();
        KhoaHocDB khoaHocDB = new KhoaHocDB(); 
        for (CapBac x : capBacDB.getlistCapBac())
            x.setKhoaHocs(khoaHocDB.getListKhoaHocByIdCapBac(x.getMaCapBac()));
    }

    
}
