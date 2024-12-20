package services;

import java.util.ArrayList;
import java.util.zip.CheckedInputStream;

import database.theoDoi.TheoDoiHocTapDB;
import model.khoahoc.LopHoc;
import model.theoDoi.TheoDoiHocTap;
import model.user.HocVien;
import utils.Chuoi;

public class TheoDoiHocTapServices {
    private TheoDoiHocTapDB theoDoiHocTapDB;

    public TheoDoiHocTapServices() {
        theoDoiHocTapDB = new TheoDoiHocTapDB();
    }

    public ArrayList<TheoDoiHocTap> displayList(ArrayList<TheoDoiHocTap> list) {
        System.out.printf("%-4s | %-4s | %-15s | %-5s | %-8s | %-8s | %-8s | %-20s\n",
            Chuoi.centerText("STT", 4), Chuoi.centerText("IDKH",4), 
                Chuoi.centerText("Ten Khoa Hoc",15), Chuoi.centerText("Lop",4),
                    Chuoi.centerText("Giua ky",8),Chuoi.centerText("Cuoi ky",8),
                        Chuoi.centerText("Tong",8),Chuoi.centerText("Trang thai", 20));
        System.out.println(Chuoi.line(95, '-'));
        int index = 1;
        for (TheoDoiHocTap x : list) 
            System.out.printf("%-4s | %s\n",Chuoi.centerText(index++ + "", 4), x.toString());
        System.out.println(Chuoi.line(95, '-'));
        return list;
    }

    public TheoDoiHocTapDB getTheoDoiHocTapDB() {
        return theoDoiHocTapDB;
    }

    public ArrayList<TheoDoiHocTap> getListTheoDoiHocTaps() {
        return theoDoiHocTapDB.getlistTheoDoiHocTap(); 
    }

    public TheoDoiHocTap getTheoDoiHocTapByID(String id) {
        return theoDoiHocTapDB.getTheoDoiHocTapById(id);
    }

    public TheoDoiHocTap getTheoDoiHocTapByKKG(String idkkg)  {
        return theoDoiHocTapDB.getTheoDoiHocTapByKKG(idkkg);
    }

    public TheoDoiHocTap getTheoDoiHocTapByKKG(String idKhoaKhaiGiang, ArrayList<TheoDoiHocTap> list) {
        return theoDoiHocTapDB.getTheoDoiHocTapByKKG(idKhoaKhaiGiang, list);
    }

    public ArrayList<TheoDoiHocTap> getListTheoDoiByHocVien(String idhocvien) {
        return theoDoiHocTapDB.getListTheoDoiByHocVien(idhocvien);
    }

    public ArrayList<TheoDoiHocTap> getListTheoDoiByLopHoc(String idLop) {
        return theoDoiHocTapDB.getListTheoDoiByLopHoc(idLop);
    }

    public ArrayList<HocVien> getHocVienTheoLopHoc(String idlop) {
        return theoDoiHocTapDB.getHocVienTheoLopHoc(idlop);
    }

    public ArrayList<LopHoc> getLopHocTheoHocVien(String idHv)  {
        return theoDoiHocTapDB.getLopHocTheoHocVien(idHv);
    }
    

    public static void main(String[] args) {
        TheoDoiHocTapServices theoDoiHocTapServices = new TheoDoiHocTapServices(); 
        theoDoiHocTapServices.displayList(theoDoiHocTapServices.getTheoDoiHocTapDB().getlistTheoDoiHocTap());
    }
}

