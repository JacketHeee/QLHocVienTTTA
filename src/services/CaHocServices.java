package services;

import database.lichhoc.*;
import model.lichhoc.CaHoc;

public class CaHocServices {
    private CaHocDB caHocDB; 

    public CaHocServices() {
        caHocDB = new CaHocDB();
    }

    public CaHoc getCaHocById(String id) {
        for (CaHoc x : caHocDB.getlistCaHoc()) 
            if (x.getMaCaHoc().equals(id))
                return x;
        return null;
    }
}
