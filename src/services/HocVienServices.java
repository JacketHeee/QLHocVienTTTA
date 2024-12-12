package services;

import database.users.HocVienDB;
import model.user.HocVien;

public class HocVienServices {
    private HocVienDB hocVienDB; 

    public HocVienServices() {
        hocVienDB = new HocVienDB();
        
    }

    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB(); 
        HocVien hv = hocVienDB.getHocVienByIDUser("10"); 
        hv.show();
    }
}
