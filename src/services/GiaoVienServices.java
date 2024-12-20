package services;

import java.util.ArrayList;

import database.users.GiaoVienDB;
import model.user.GiaoVien;

public class GiaoVienServices {
    private GiaoVienDB giaoVienDB; 

    public GiaoVienServices() {
        giaoVienDB = new GiaoVienDB();
    }

    public ArrayList<GiaoVien> getListGiaoVien() {
        return giaoVienDB.getListGiaoVien();
    }

    public GiaoVien getGiaoVienByID(String id) {
        return giaoVienDB.getGiaoVienByID(id);
    }
    
    public GiaoVien getGiaoVienByIDUser(String id) {
        return giaoVienDB.getGiaoVienByIDUser(id);
    }
    
    public static void main(String[] args) {
        GiaoVienDB giaoVienDB = new GiaoVienDB();
        GiaoVien hv = giaoVienDB.getGiaoVienByIDUser("10"); 
        hv.show();
    }
}
