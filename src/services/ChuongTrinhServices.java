package services;

import database.khoahoc.CapBacDB;
import database.khoahoc.ChuongTrinhDB;
import model.khoahoc.ChuongTrinh;

public class ChuongTrinhServices {
    private ChuongTrinhDB chuongTrinhDB; 

    public ChuongTrinhServices() {
        chuongTrinhDB = new ChuongTrinhDB();
        CapBacDB capBacDB = new CapBacDB();
        for (ChuongTrinh x : chuongTrinhDB.getlistChuongTrinh())
            x.setCapBacs(capBacDB.getListCapBacByIdChuongTrinh(x.getMaChuongTrinh()));
    }

    public ChuongTrinhDB getChuongTrinhDB() {
        return chuongTrinhDB;
    }
}
