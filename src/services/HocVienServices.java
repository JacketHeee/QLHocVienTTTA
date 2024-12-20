package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import database.lichhoc.KhoaKhaiGiangDB;
import database.theoDoi.TheoDoiHocTapDB;
import database.users.HocVienDB;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.person.DiaChi;
import model.person.NgayThangNam;
import model.theoDoi.TheoDoiHocTap;
import model.user.HocVien;

public class HocVienServices {
    private HocVienDB hocVienDB;
    private TheoDoiHocTapDB theoDoiHocTapDB;
    private HocVien hocVien = null;
    private ArrayList<HocVien> lisHocViens;
    private TheoDoiHocTapServices theoDoiHocTapServices = null;
    
    public HocVienServices() {
        hocVienDB = new HocVienDB();
        lisHocViens = hocVienDB.getListHocVien();
        theoDoiHocTapDB = new TheoDoiHocTapDB();
        for (HocVien x : lisHocViens) {
            x.setLopHocs(theoDoiHocTapDB.getLopHocTheoHocVien(x.getMaHocVien()));
            x.setTheoDoiHocTaps(theoDoiHocTapDB.getListTheoDoiByHocVien(x.getMaHocVien()));  
        }
    }

    public HocVienServices(HocVien hocVien) {
        hocVienDB = new HocVienDB();
        this.hocVien = hocVien; 
        theoDoiHocTapDB = new TheoDoiHocTapDB();
        hocVien.setLopHocs(theoDoiHocTapDB.getLopHocTheoHocVien(hocVien.getMaHocVien())); //loi
        hocVien.setTheoDoiHocTaps(theoDoiHocTapDB.getListTheoDoiByHocVien(hocVien.getMaHocVien()));  
    }

    public void displayTheoDoiHocTap() {
        ArrayList<TheoDoiHocTap> list = theoDoiHocTapDB.getListTheoDoiByHocVien(hocVien.getMaHocVien());
        for (TheoDoiHocTap x : list) 
            x.show();
    }

    public ArrayList<KhoaKhaiGiang> getKhoaKhaiGiangHienco() {
        ArrayList<KhoaKhaiGiang> list = new ArrayList<>();
        KhoaKhaiGiangDB khoaKhaiGiangDB = new KhoaKhaiGiangDB();

        for (KhoaKhaiGiang x : khoaKhaiGiangDB.getlistKhoaKhaiGiang()) 
            for (int i=0; i<hocVien.getLopHocs().size(); i++) 
                if (x.getMaKhoaKhaiGiang().equals(hocVien.getLopHocs().get(i).getkhoaKhaiGiang().getMaKhoaKhaiGiang())) {
                    list.add(x);
                    break;
                }
        return list;
    }

    public ArrayList<TheoDoiHocTap> getTheoDoiHocTapTheoKhoa(String idKKG) {
        ArrayList<TheoDoiHocTap> list = new ArrayList<>();
        for (TheoDoiHocTap x : hocVien.getTheoDoiHocTaps())
            if (x.getLopHoc().getkhoaKhaiGiang().getMaKhoaKhaiGiang().equals(idKKG)) 
                list.add(x);
        return list;
    }
    public void displayTheoDoiHocTapByKhoaKG(ArrayList<KhoaKhaiGiang> list) {
        if (theoDoiHocTapServices == null) 
            theoDoiHocTapServices = new TheoDoiHocTapServices();
        for (int i = list.size()-1; i>=0; i--) {
            System.out.printf("\033[1;4mKhoa khai giang: %s, nam hoc: %s\033[0m\n\n",list.get(i).getTenKhoaKhaiGiang(),list.get(i).getNamHoc()+"");
            theoDoiHocTapServices.displayList(getTheoDoiHocTapTheoKhoa(list.get(i).getMaKhoaKhaiGiang()));
            System.out.println("");
        }
    }

    public void capNhatThongTin(HocVien hocVien, String hoten, NgayThangNam ngaySinh, DiaChi noiSinh, int gioiTinh) {
        hocVien.setHoten(hoten);
        hocVien.setNgaysinh(ngaySinh);
        hocVien.setNoisinh(noiSinh);
        hocVien.setGioitinh(gioiTinh);
        hocVienDB.capNhatHocVien(hocVien);
    }

    public ArrayList<HocVien> getListHocVien() {
        return hocVienDB.getListHocVien();
    }

    public HocVien getHocVienByIDHocVien(String id) {
        return hocVienDB.getHocvienByID(id);
    }

    public HocVien getHocVienByIDUser(String id) {
        return hocVienDB.getHocVienByIDUser(id);
    }



    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB();
        HocVien hv = hocVienDB.getHocvienByID("2");
        HocVienServices hocVienServices = new HocVienServices(hv); 
        hocVienServices.displayTheoDoiHocTap();
    }
}
