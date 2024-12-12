package database.users;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.person.DiaChi;
import model.person.NgayThangNam;
import model.person.TinhThanh;
import model.user.HocVien;
import model.user.NguoiDung;
import services.UserServices;

public class HocVienDB {
    private ArrayList<HocVien> listHocVien; 
    static String src;
    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB(); 
        for (HocVien x: hocVienDB.getListHocVien()) 
            x.show();
    }
    public HocVienDB() {
        src = "data/users/HocVien_data.txt";
        listHocVien = this.docFile();
    }

    public ArrayList<HocVien> getListHocVien() {
        return listHocVien;
    }
    public void setListHocVien(ArrayList<HocVien> listHocVien) {
        this.listHocVien = listHocVien;
    }
    public ArrayList<HocVien> docFile() {
        ArrayList<HocVien> listHocVien = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String[] user = sc.nextLine().split("#"); 
                UserServices userServices = new UserServices();
                NguoiDung us = userServices.getUserByID(user[1]); 
                NgayThangNam ns = new NgayThangNam(user[3],user[4],user[5]);
                DiaChi noisinh = new DiaChi(user[6],user[7],user[8],user[9],TinhThanh.layTinhTheoMaTinh(user[10]));
                listHocVien.add(new HocVien(user[0],us,user[2],ns,noisinh,Integer.parseInt(user[11])));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listHocVien;
    }


    public HocVien getHocvienByID(String id) {
        for (HocVien x : this.listHocVien) 
            if (x.getMaHocVien().equals(id))
                return x;
        return null;
    }
    public HocVien getHocVienByIDUser(String id) {
        for (HocVien x : this.listHocVien) 
            if (x.getMaNguoiDung().getMaNguoiDung().equals(id))
                return x;
        return null;
    }
    
}