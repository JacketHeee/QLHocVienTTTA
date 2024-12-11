package services;

import database.users.HocVienDB;
import model.user.HocVien;

public class HocVienServices {
    private HocVienDB hocVienDB; 

    public HocVienServices() {
        hocVienDB = new HocVienDB();
    }

    public HocVien getHocvienByID(String id) {
        for (HocVien x : hocVienDB.getListHocVien()) 
            if (x.getMaHocVien().equals(id))
                return x;
        return null;
    }
    public HocVien getHocVienByIDUser(String id) {
        for (HocVien x : hocVienDB.getListHocVien()) 
            if (x.getMaNguoiDung().getMaNguoiDung().equals(id))
                return x;
        return null;
    }
    public static void main(String[] args) {
        HocVienServices hocVienServices = new HocVienServices(); 
        HocVien hv = hocVienServices.getHocVienByIDUser("10"); 
        hv.show();
        // hocVienServices.getHocVienByIDUser("10").show();
        // for (HocVien x : )
    }
}
