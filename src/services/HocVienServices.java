package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import database.theoDoi.TheoDoiHocTapDB;
import database.users.HocVienDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.user.HocVien;

public class HocVienServices {
    private HocVienDB hocVienDB; 
    private HocVien hocVien;

    public HocVienServices(HocVien hocVien) {
        hocVienDB = new HocVienDB();
        this.hocVien = hocVien;  
        TheoDoiHocTapDB theoDoiHocTapDB = new TheoDoiHocTapDB();
        hocVien.setLopHocs(theoDoiHocTapDB.getLopHocTheoHocVien(hocVien.getMaHocVien()));      
    }

    // public KhoaHoc getKhoaHocCaoNhatDaHoanThanh() {
    //     ArrayList<KhoaHoc> list = new ArrayList<>();
    //     for (LopHoc x : hocVien.getLopHocs())
    //         list.add(x.getkhoaHoc()); 
    //     list.sort(new Comparator<KhoaHoc>() {
    //         @Override
    //         public int compare(KhoaHoc hv1, KhoaHoc hv2) {
    //             return hv1.compareTo(hv2);
    //         }
    //     });
    //     return list.
    // }
    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB(); 
        HocVien hv = hocVienDB.getHocVienByIDUser("10"); 
        hv.show();
    }
}
