package services;

import database.users.GiaoVienDB;
import model.user.GiaoVien;

public class GiaoVienServices {
    private GiaoVienDB GiaoVienDB; 

    public GiaoVienServices() {
        GiaoVienDB = new GiaoVienDB();
    }

    public static void main(String[] args) {
        GiaoVienDB giaoVienDB = new GiaoVienDB();
        GiaoVien hv = giaoVienDB.getGiaoVienByIDUser("10"); 
        hv.show();
    }
}
