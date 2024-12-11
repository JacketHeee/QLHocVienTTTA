package services;

import database.users.GiaoVienDB;
import model.user.GiaoVien;

public class GiaoVienServices {
    private GiaoVienDB GiaoVienDB; 

    public GiaoVienServices() {
        GiaoVienDB = new GiaoVienDB();
    }

    public GiaoVien getGiaoVienByID(String id) {
        for (GiaoVien x : GiaoVienDB.getListGiaoVien()) 
            if (x.getMaGV().equals(id))
                return x;
        return null;
    }
    public GiaoVien getGiaoVienByIDUser(String id) {
        for (GiaoVien x : GiaoVienDB.getListGiaoVien()) 
            if (x.getMaNguoiDung().getMaNguoiDung().equals(id))
                return x;
        return null;
    }
    public static void main(String[] args) {
        GiaoVienServices GiaoVienServices = new GiaoVienServices(); 
        GiaoVien hv = GiaoVienServices.getGiaoVienByIDUser("10"); 
        hv.show();
        // GiaoVienServices.getGiaoVienByIDUser("10").show();
        // for (GiaoVien x : )
    }
}
