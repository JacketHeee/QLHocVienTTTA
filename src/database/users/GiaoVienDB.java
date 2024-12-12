package database.users;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.person.DiaChi;
import model.person.NgayThangNam;
import model.person.TinhThanh;
import model.user.GiaoVien;
import model.user.NguoiDung;
import services.UserServices;

public class GiaoVienDB {
    private ArrayList<GiaoVien> listGiaoVien; 
    static String src;
    public static void main(String[] args) {
        GiaoVienDB GiaoVienDB = new GiaoVienDB(); 
        for (GiaoVien x: GiaoVienDB.getListGiaoVien()) 
            x.show();
    }
    public GiaoVienDB() {
        src = "data/users/GiaoVien_data.txt";
        listGiaoVien = this.docFile();
    }

    public ArrayList<GiaoVien> getListGiaoVien() {
        return listGiaoVien;
    }
    public void setListGiaoVien(ArrayList<GiaoVien> listGiaoVien) {
        this.listGiaoVien = listGiaoVien;
    }
    public ArrayList<GiaoVien> docFile() {
        ArrayList<GiaoVien> listGiaoVien = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String[] user = sc.nextLine().split("#"); 
                UserServices userServices = new UserServices();
                NguoiDung us = userServices.getUserByID(user[1]); 
                NgayThangNam ns = new NgayThangNam(user[6],user[7],user[8]);
                DiaChi noisinh = new DiaChi(user[9],user[10],user[11],user[12],TinhThanh.layTinhTheoMaTinh(user[13]));
                listGiaoVien.add(new GiaoVien(user[0],us,user[2],user[3],user[4],user[5],ns,noisinh,Integer.parseInt(user[14])));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listGiaoVien;
    }


    public GiaoVien getGiaoVienByID(String id) {
        for (GiaoVien x : this.listGiaoVien) 
            if (x.getMaGV().equals(id))
                return x;
        return null;
    }
    public GiaoVien getGiaoVienByIDUser(String id) {
        for (GiaoVien x : this.listGiaoVien) 
            if (x.getMaNguoiDung().getMaNguoiDung().equals(id))
                return x;
        return null;
    }
}
