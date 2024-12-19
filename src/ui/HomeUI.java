package ui;
import java.util.ArrayList;

import database.chinhanh_phonghoc.ChiNhanhDB;
import database.khoahoc.CapBacDB;
import database.khoahoc.ChuongTrinhDB;
import database.khoahoc.KhoaHocDB;
import database.lichhoc.GioHocDB;
import model.khoahoc.CapBac;
import model.khoahoc.ChuongTrinh;
import model.lichhoc.GioHoc;
import services.ChuongTrinhServices;
import model.chinhanh_phonghoc.ChiNhanh;
import model.khoahoc.*;

public class HomeUI {
    public static void menu() {
        System.out.println("===== HE THONG QUAN LY HOC VIEN TRUNG TAM TIENG ANH =====");
        System.out.println("1: Dang nhap");
        System.out.println("2: Tim kiem khoa hoc");
        System.out.println("3: Xem danh sach khoa hoc");
        System.out.println("4: Xem danh sach lop hoc sap khai giang");
        System.out.println("5: Gui yeu cau tu van");
        System.out.println("6: Tim kiem lop hoc");
        System.out.println("x: Thoat");    
        System.out.println("--------------------------"); 
    }

    public static void menu_2() {
        System.out.println("1: Xem chi tiet khoa hoc");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_2_1() {
        System.out.println("--------------------------");
        System.out.println("1: Xem chi tiet lop hoc");
        System.out.println("2: Gui yeu cau tu van");
        System.out.println("3: Loc lop hoc");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_2_2() {
        System.out.println("1: Loc theo chuong trinh");
        System.out.println("2: Loc theo cap bac");
        System.out.println("3: Loc theo khoang gia");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_2_1_1() {
        System.out.println("--------------------------");
        System.out.println("1: Gui yeu cau tu van");
        System.out.println("2: Dang ky ghi danh ngay");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_3() {
        System.out.println("==============XEM DANH SACH KHOA HOC==============");
        System.out.println("1: Xem tat ca");
        System.out.println("2: Chon chuong trinh");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_3_afterDisplay() {
        System.out.println("--------------------------");
        System.out.println("1: Xem chi tiet khoa hoc");
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_3_2() {
        System.out.println("=============CHON CHUONG TRINH=============");
        int index = 1; 
        ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB(); 
        for (ChuongTrinh x : chuongTrinhDB.getlistChuongTrinh())
            System.out.printf("%d: %s\n",index++, x.getTenChuongTrinh());
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static void menu_3_2_i(int index) {
        System.out.println("==============CHON CAP BAC===================");
        ChuongTrinhServices chuongTrinhServices = new ChuongTrinhServices();
        System.out.println("1: Xem tat ca");
        int i = 2;
        for (CapBac x : chuongTrinhServices.getChuongTrinhDB().getlistChuongTrinh().get(index-1).getCapBacs())
            System.out.printf("%d: %s\n",i++,x.getTenCapBac());
        System.out.println("x: Quay lai");
        System.out.println("--------------------------");
    }

    public static ArrayList<ChuongTrinh> menu_ChuongTrinh() {
        System.out.println("=============CHON CHUONG TRINH=============");
        int index = 1; 
        ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB(); 
        ArrayList<ChuongTrinh> list = chuongTrinhDB.getlistChuongTrinh();
        for (ChuongTrinh x : list)
            System.out.printf("%d: %s\n",index++, x.getTenChuongTrinh());
        System.out.println("--------------------------");
        return list;
    }

    public static ArrayList<KhoaHoc> menu_Khoahoc(char index) {
        System.out.println("=================CHON KHOA HOC==================");
        ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB();
        KhoaHocDB khoaHocDB = new KhoaHocDB();
        ArrayList<KhoaHoc> list;
        if (index != 'c') 
            list = khoaHocDB.getListKhoaHocByIdChuongTrinh(chuongTrinhDB.getlistChuongTrinh().get(Integer.parseInt(index+"")-1).getMaChuongTrinh());
        else 
            list = khoaHocDB.getlistKhoaHoc();
        int i = 1; 
        for (KhoaHoc x : list) 
        System.out.printf("%d: %s\n",i++,x.getTenKhoaHoc());
        System.out.println("c: bo qua");
        System.out.println("---------------------------------");
        return list;
    }

    public static ArrayList<ChiNhanh> menu_ChiNhanh() {
        System.out.println("==============CHON CHI NHANH==========");
        ChiNhanhDB chiNhanhDB = new ChiNhanhDB(); 
        int i =1;
        ArrayList<ChiNhanh>  list = chiNhanhDB.getlistChiNhanh();
        for (ChiNhanh x : list) 
        System.out.printf("%d: %s\n",i++,x.getTenChiNhanh());
        System.out.println("c: bo qua");
        System.out.println("---------------------------------");
        return list;
    }

    public static ArrayList<GioHoc> menu_GioHoc() {
        System.out.println("==========Chon gio hoc==========");
        GioHocDB gioHocDB =  new GioHocDB();
        ArrayList<GioHoc> list = gioHocDB.getlistGioHoc(); 
        int i = 1;
        for (GioHoc x : list) 
            System.out.printf("%d: %s\n",i++,x.toString());
        System.out.println("c: bo qua");
        System.out.println("---------------------------------");
        return list;
    }
    public static void menu_6() {
        System.out.println("1: Bat dau chon lua");
        System.out.println("x: Quay lai");
    }

    public static void main(String[] args) {
        menu_GioHoc();
    }
}
