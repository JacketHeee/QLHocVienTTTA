package services;

import database.khoahoc.ChuongTrinhDB;
import model.khoahoc.ChuongTrinh;

public class ChuongTrinhServices {
    private ChuongTrinhDB chuongTrinhDB; 

    public ChuongTrinhServices() {
        chuongTrinhDB = new ChuongTrinhDB();
    }

    public ChuongTrinh getChuongTrinhById(String id) {
        for (ChuongTrinh x : chuongTrinhDB.getlistChuongTrinh()) 
            if (x.getMaChuongTrinh().equals(id))
                return x;
        return null;
    }
}
