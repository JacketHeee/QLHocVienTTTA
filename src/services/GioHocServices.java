package services;

import database.lichhoc.GioHocDB;
import model.lichhoc.GioHoc;

public class GioHocServices {
    private GioHocDB GioHocDB; 

    public GioHocServices() {
        GioHocDB = new GioHocDB();
    }

    public GioHoc getGioHocById(String id) {
        for (GioHoc x : GioHocDB.getlistGioHoc()) 
            if (x.getMaTKB().equals(id))
                return x;
        return null;
    }
}
