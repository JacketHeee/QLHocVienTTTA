package services;

import java.util.ArrayList;

import database.users.GiaoVienDB;
import model.khoahoc.LopHoc;
import model.person.NgayThangNam;
import model.user.GiaoVien;
import utils.Date;

public class GiaoVienServices {
    private GiaoVienDB giaoVienDB; 
    private LopHocServices lopHocServices;

    public GiaoVienServices(LopHocServices lopHocServices) {
        giaoVienDB = new GiaoVienDB();
        this.lopHocServices = lopHocServices;
    }

    public void themLopHocVaoGiangVien(GiaoVien gv) {
        gv.setLopHocs(lopHocServices.getLopHocTheoGiaoVien(gv.getMaGV()));
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

    public ArrayList<LopHoc> getLopHocHienTai(GiaoVien gv) {
        NgayThangNam datenow = Date.now();
        ArrayList<LopHoc> list = new ArrayList<>();
        for (LopHoc x : gv.getLopHocs()) 
            if (x.getkhoaKhaiGiang().getThoiGianBatDau().compareTo(datenow) <=0 && x.getkhoaKhaiGiang().getThoiGianKetThuc().compareTo(datenow)>=0)
                list.add(x);
        return list;
    }
    
    public ArrayList<LopHoc> getLopHocSapKhaiGiang(GiaoVien gv) {
        NgayThangNam datenow = Date.now();
        ArrayList<LopHoc> list = new ArrayList<>();
        for (LopHoc x : gv.getLopHocs()) 
            if (x.getkhoaKhaiGiang().getThoiGianBatDau().compareTo(datenow) >= 0)
                list.add(x);
        return list;
    }
    public static void main(String[] args) {
        GiaoVienDB giaoVienDB = new GiaoVienDB();
        GiaoVien hv = giaoVienDB.getGiaoVienByIDUser("10"); 
        hv.show();
    }
}
