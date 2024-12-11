package services;

import java.util.ArrayList;

import database.chinhanh_phonghoc.ChiNhanhDB;
import model.chinhanh_phonghoc.ChiNhanh;
import model.user.HocVien;


public class ChiNhanhServices {
    private ChiNhanhDB chiNhanhDB; 

    public ChiNhanhServices() {
        chiNhanhDB = new ChiNhanhDB();
    }

    public ChiNhanh getChiNhanhById(String id) {
        for (ChiNhanh x : chiNhanhDB.getlistChiNhanh()) 
            if (x.getMaChiNhanh().equals(id))
                return x;
        return null;
    }
}
