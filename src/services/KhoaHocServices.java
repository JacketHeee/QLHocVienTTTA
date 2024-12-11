package services;

import database.khoahoc.KhoaHocDB;
import model.khoahoc.KhoaHoc;

public class KhoaHocServices {
    private KhoaHocDB KhoaHocDB; 

    public KhoaHocServices() {
        KhoaHocDB = new KhoaHocDB();
    }

    public KhoaHoc getKhoaHocById(String id) {
        for (KhoaHoc x : KhoaHocDB.getlistKhoaHoc()) 
            if (x.getMaKhoaHoc().equals(id))
                return x;
        return null;
    }
}
