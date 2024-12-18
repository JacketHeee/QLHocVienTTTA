package database.theoDoi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import database.khoahoc.LopHocDB;
import database.users.HocVienDB;
import model.khoahoc.LopHoc;
import model.theoDoi.TheoDoiHocTap;
import model.user.HocVien;

public class TheoDoiHocTapDB {
    private ArrayList<TheoDoiHocTap> listTheoDoiHocTap; 
    static String src;

    public TheoDoiHocTapDB() {
        src = "data/theodoi/TheoDoiHocTap_data.txt";
        listTheoDoiHocTap = this.docFile();
    }

    public ArrayList<TheoDoiHocTap> getlistTheoDoiHocTap() {
        return listTheoDoiHocTap;
    }

    public void setlistTheoDoiHocTap(ArrayList<TheoDoiHocTap> listTheoDoiHocTap) {
        this.listTheoDoiHocTap = listTheoDoiHocTap;
    }

    public ArrayList<TheoDoiHocTap> docFile() {
        ArrayList<TheoDoiHocTap> listTheoDoiHocTap = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                HocVienDB hocVienDB = new HocVienDB();
                HocVien hv = hocVienDB.getHocvienByID(tmp[1]);
                LopHocDB lopHocDB = new LopHocDB();
                LopHoc lop = lopHocDB.getLopHocById(tmp[2]);
                double dgk = Double.parseDouble(tmp[4]);
                double dck = Double.parseDouble(tmp[5]);
                double total = Double.parseDouble(tmp[6]);
                listTheoDoiHocTap.add(new TheoDoiHocTap(tmp[0], hv, lop, tmp[3], dgk, dck, total, tmp[7]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listTheoDoiHocTap;
    }

    public static void main(String[] args) {
        TheoDoiHocTapDB TheoDoiHocTapDB = new TheoDoiHocTapDB(); 
        for (TheoDoiHocTap x : TheoDoiHocTapDB.getlistTheoDoiHocTap())
            x.show();
    }

    
    public TheoDoiHocTap getTheoDoiHocTapById(String id) {
        for (TheoDoiHocTap x : this.listTheoDoiHocTap) 
            if (x.getMaTheoDoi().equals(id))
                return x;
        return null;
    }

    public ArrayList<TheoDoiHocTap> getListTheoDoiByHocVien(String idhocvien) {
        ArrayList<TheoDoiHocTap> list = new ArrayList<>();
        for (TheoDoiHocTap x : listTheoDoiHocTap) 
            if (x.getHocVien().getMaHocVien().equals(idhocvien))
                list.add(x);
        return list;
    }  
    
    public ArrayList<TheoDoiHocTap> getListTheoDoiByLopHoc(String idLop) {
        ArrayList<TheoDoiHocTap> list = new ArrayList<>();
        for (TheoDoiHocTap x : listTheoDoiHocTap) 
            if (x.getLopHoc().getMaLopHoc().equals(idLop))
                list.add(x);
        return list;
    }  

    public ArrayList<LopHoc> getLopHocTheoHocVien(String idHv) {
        ArrayList<LopHoc> list = new ArrayList<>();
        for (TheoDoiHocTap x : listTheoDoiHocTap) 
            if (x.getHocVien().getMaHocVien().equals(idHv)) 
                list.add(x.getLopHoc());
        return list;
    }

    public ArrayList<HocVien> getHocVienTheoLopHoc(String idlop) {
        ArrayList<HocVien> list = new ArrayList<>();
        for (TheoDoiHocTap x : listTheoDoiHocTap) 
            if (x.getHocVien().getMaHocVien().equals(idlop)) 
                list.add(x.getHocVien());
        return list;
    }
}
