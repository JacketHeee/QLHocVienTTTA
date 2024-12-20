package services;

import java.util.ArrayList;

import database.khoahoc.LopHocDB;
import database.theoDoi.TheoDoiHocTapDB;
import model.chinhanh_phonghoc.ChiNhanh;
import model.khoahoc.ChuongTrinh;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.lichhoc.GioHoc;
import utils.Chuoi;

public class LopHocServices {
    private LopHocDB lopHocDB; 

    public LopHocServices() {
        lopHocDB = new LopHocDB();
        TheoDoiHocTapDB theoDoiHocTapDB = new TheoDoiHocTapDB();
        for (LopHoc x : lopHocDB.getlistLopHoc())
            x.setHocViens(theoDoiHocTapDB.getHocVienTheoLopHoc(x.getMaLopHoc()));
    }
    
    public ArrayList<LopHoc> displayList(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(135,'-')); 
        System.out.printf("%4s | %-20s | %-10s | %-10s | %-10s | %-35s | %s\n",Chuoi.centerText("STT",4),
            Chuoi.centerText("Ten khoa hoc", 20),Chuoi.centerText("Ngay KG",10),
        Chuoi.centerText("SL toi da", 10),Chuoi.centerText("SL hien co",10),
        Chuoi.centerText("Gio hoc",35),Chuoi.centerText("Chi nhanh",30));
        System.out.println(Chuoi.line(135,'-')); 
        int index = 1;
        for (LopHoc x : list) 
        System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforPre());
        System.out.println(Chuoi.line(135,'-')); 
        System.out.println(""); 
        return list;
    }
    

    public ArrayList<LopHoc> displayListInHoaDon(ArrayList<LopHoc> list) {
        System.out.println(Chuoi.line(71,'-')); 
        System.out.printf("%4s | %-5s | %-20s | %-20s | %-10s\n",Chuoi.centerText("STT",4),
        Chuoi.centerText("ID",5),Chuoi.centerText("Ten lop hoc", 20),Chuoi.centerText("Ten khoa hoc",20),
        Chuoi.centerText("Ngay KG", 10));
        System.out.println(Chuoi.line(71,'-')); 
        int index = 1;
        for (LopHoc x : list) 
            System.out.println(String.format("%4s | ", Chuoi.centerText(index++ + "",4))+ x.getInforForHoaDon());
        System.out.println(Chuoi.line(71,'-')); 
        return list;
    }

    public ArrayList<LopHoc> displayAllLopHoc() {
        return displayList(lopHocDB.getlistLopHoc());
    }

    public ArrayList<LopHoc> displayAllKhoaHocSapKhaiGiang() {
        return displayList(lopHocDB.getLopHocSapKhaiGiang());
    }

    public ArrayList<LopHoc> getKhoaHocSapKhaiGiang() {
        return lopHocDB.getLopHocSapKhaiGiang();
    }
      
    public ArrayList<LopHoc> timKiemLopHoc(ChuongTrinh ct,GioHoc gh, ChiNhanh cn) {
        ArrayList<LopHoc> list = new ArrayList<>(); 
        if (gh == null && cn != null) {
            for (LopHoc x : lopHocDB.getlistLopHoc())
            if (x.getphongHoc().getchiNhanh().getMaChiNhanh().equals(cn.getMaChiNhanh()) 
                && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                    list.add(x);
        }
        else 
        if (gh != null && cn == null) {
            for (LopHoc x : lopHocDB.getlistLopHoc())
                if (x.getgioHoc().getMaTKB().equals(gh.getMaTKB())
                    && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                list.add(x);
        } else 
        if (gh != null && cn != null) {
            for (LopHoc x : lopHocDB.getlistLopHoc())
                if (x.getgioHoc().getMaTKB().equals(gh.getMaTKB()) && x.getphongHoc().getchiNhanh().getMaChiNhanh().equals(cn.getMaChiNhanh())
                    && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                list.add(x);
        }
        else {
            for (LopHoc x : lopHocDB.getlistLopHoc())
                if (x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh()))
                    list.add(x);
        }
        return list;
    }

    public ArrayList<LopHoc> timKiemLopHoc(ArrayList<LopHoc> listLop,ChuongTrinh ct,GioHoc gh, ChiNhanh cn) {
        ArrayList<LopHoc> list = new ArrayList<>(); 
        if (gh == null && cn != null) {
            for (LopHoc x : listLop)
            if (x.getphongHoc().getchiNhanh().getMaChiNhanh().equals(cn.getMaChiNhanh()) 
                && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                    list.add(x);
        }
        else 
        if (gh != null && cn == null) {
            for (LopHoc x : listLop)
                if (x.getgioHoc().getMaTKB().equals(gh.getMaTKB())
                    && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                list.add(x);
        } else 
        if (gh != null && cn != null) {
            for (LopHoc x : listLop)
                if (x.getgioHoc().getMaTKB().equals(gh.getMaTKB()) && x.getphongHoc().getchiNhanh().getMaChiNhanh().equals(cn.getMaChiNhanh())
                    && x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh())) 
                list.add(x);
        }
        else {
            for (LopHoc x : listLop)
                if (x.getkhoaHoc().getcapBac().getChuongTrinh().getMaChuongTrinh().equals(ct.getMaChuongTrinh()))
                    list.add(x);
        }
        return list;
    }

    public double tinhTongTien(ArrayList<LopHoc> list) {
        double tong = 0; 
        if (list != null && !list.isEmpty()) {
            for (LopHoc x : list) 
                tong += x.getkhoaHoc().getHocPhi();
        }
        return tong;
    }

    public ArrayList<LopHoc> getlistLopHoc() {
        return lopHocDB.getlistLopHoc();
    }

    public LopHoc getLopHocById(String id) {
        return lopHocDB.getLopHocById(id);
    }
    public ArrayList<LopHoc> getLopHoctheoIDKhoaHoc(String id) {
        return lopHocDB.getLopHoctheoIDKhoaHoc(id);
    }
    public ArrayList<LopHoc> getLopHocSapKhaiGiang () {
        return lopHocDB.getLopHocSapKhaiGiang();
    }

    public static void main(String[] args) {
        LopHocServices lopHocServices = new LopHocServices();
        lopHocServices.displayAllLopHoc();
    }
        
}
