package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.chinhanh_phonghoc.PhongHoc;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.lichhoc.GioHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.user.GiaoVien;
import services.CapBacServices;
import services.GiaoVienServices;
import services.GioHocServices;
import services.KhoaHocServices;
import services.KhoaKhaiGiangServices;
import services.PhongHocServices;

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
                KhoaHocServices khoaHocServices = new KhoaHocServices(); 
                KhoaHoc kh = khoaHocServices.getKhoaHocById(tmp[2]);
                KhoaKhaiGiangServices khaiGiangServices = new KhoaKhaiGiangServices();
                KhoaKhaiGiang kkh = khaiGiangServices.getKhoaKhaiGiangById(tmp[3]);
                PhongHocServices phongHocServices = new PhongHocServices();
                PhongHoc phong = phongHocServices.getPhongHocById(tmp[4]);
                GiaoVienServices giaoVienServices =  new GiaoVienServices();
                GiaoVien gvChinh = giaoVienServices.getGiaoVienByID(tmp[5]); 
                GiaoVien troGiang = giaoVienServices.getGiaoVienByID(tmp[6]); 
                int soLuongToiDa = Integer.parseInt(tmp[7]);
                GioHocServices gioHocServices = new GioHocServices(); 
                GioHoc giohoc = gioHocServices.getGioHocById(tmp[9]);
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
}
