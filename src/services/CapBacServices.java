package services;

import database.khoahoc.CapBacDB;
import database.khoahoc.KhoaHocDB;
import model.khoahoc.CapBac;

import java.util.*;

public class CapBacServices {
    private CapBacDB capBacDB; 
    private ArrayList<CapBac> listCapBac;

    public CapBacServices() {
        capBacDB = new CapBacDB();
        listCapBac = capBacDB.getlistCapBac();
    }

    public void themKhoaHocVaoCapbac(KhoaHocServices khoaHocServices)  {
        KhoaHocDB khoaHocDB = new KhoaHocDB(); 
        for (CapBac x : capBacDB.getlistCapBac())
            x.setKhoaHocs(khoaHocServices.getListKhoaHocByIdCapBac(x.getMaCapBac()));
    }
    public ArrayList<CapBac> getlistCapBac() {
        return listCapBac;
    }

    public CapBac getCapBacById(String id)  {
        return capBacDB.getCapBacById(id);
    }
    
    public ArrayList<CapBac> getListCapBacByIdChuongTrinh(String id) {
        return capBacDB.getListCapBacByIdChuongTrinh(id);
    }
    
    public static void main(String[] args) {
        CapBacServices capBacServices = new CapBacServices();
        for (CapBac x : capBacServices.getlistCapBac())
            x.showForThongKeTheoTrinhDo();
    }
    
}
