package services;

import database.khoahoc.CapBacDB;
import model.khoahoc.CapBac;

public class CapBacServices {
    private CapBacDB CapBacDB; 

    public CapBacServices() {
        CapBacDB = new CapBacDB();
    }

    public CapBac getCapBacById(String id) {
        for (CapBac x : CapBacDB.getlistCapBac()) 
            if (x.getMaCapBac().equals(id))
                return x;
        return null;
    }
}
