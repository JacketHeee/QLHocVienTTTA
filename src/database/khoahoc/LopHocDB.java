package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import database.chinhanh_phonghoc.PhongHocDB;
import database.lichhoc.GioHocDB;
import database.lichhoc.KhoaKhaiGiangDB;
import database.users.GiaoVienDB;
import model.chinhanh_phonghoc.PhongHoc;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.lichhoc.GioHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.user.GiaoVien;

public class LopHocDB {
       private ArrayList<LopHoc> listLopHoc; 
    static String src;

    public LopHocDB() {
        src = "data/khoahoc/LopHoc_data.txt";
        listLopHoc = this.docFile();
    }

    public ArrayList<LopHoc> getlistLopHoc() {
        return listLopHoc;
    }

    public void setlistLopHoc(ArrayList<LopHoc> listLopHoc) {
        this.listLopHoc = listLopHoc;
    }
    public ArrayList<LopHoc> docFile() {
        ArrayList<LopHoc> listLopHoc = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                KhoaHocDB khoaHocDB = new KhoaHocDB();
                KhoaHoc kh = khoaHocDB.getKhoaHocById(tmp[2]);
                KhoaKhaiGiangDB khaiGiangDB = new KhoaKhaiGiangDB();
                KhoaKhaiGiang kkh = khaiGiangDB.getKhoaKhaiGiangById(tmp[3]);
                PhongHocDB phongHocDB = new PhongHocDB();
                PhongHoc phong = phongHocDB.getPhongHocById(tmp[4]);
                GiaoVienDB giaoVienDB = new GiaoVienDB();
                GiaoVien gvChinh = giaoVienDB.getGiaoVienByID(tmp[5]); 
                GiaoVien troGiang = giaoVienDB.getGiaoVienByID(tmp[6]); 
                int soLuongToiDa = Integer.parseInt(tmp[7]);
                GioHocDB gioHocDB = new GioHocDB();
                GioHoc giohoc = gioHocDB.getGioHocById(tmp[9]);
                listLopHoc.add(new LopHoc(tmp[0],tmp[1],kh,kkh,phong,gvChinh,troGiang,soLuongToiDa,tmp[8],giohoc));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listLopHoc;
    }

    public static void main(String[] args) {
        LopHocDB LopHocDB = new LopHocDB(); 
        for (LopHoc x : LopHocDB.getlistLopHoc())
            x.show();
    }

    
    public LopHoc getLopHocById(String id) {
        for (LopHoc x : this.listLopHoc) 
            if (x.getMaLopHoc().equals(id))
                return x;
        return null;
    }

    public ArrayList<LopHoc> getLopHoctheoIDKhoaHoc(String id) {
        ArrayList<LopHoc> list = new ArrayList<>(); 
        for (LopHoc x : this.listLopHoc) 
            if (x.getkhoaHoc().getMaKhoaHoc().equals(id)) 
                list.add(x); 
        return list;
    }

    // public ArrayList<LopHoc> getLopHocSapKhaiGiangTheoIDKhoaHoc(String id) {
    //     ArrayList<LopHoc> list = new ArrayList<>(); 
    //     for (LopHoc x : this.listLopHoc) 
    //         if (x.getkhoaHoc().getMaKhoaHoc().equals(id)) 
    //             list.add(x); 
    //     return list;
    // }

}
