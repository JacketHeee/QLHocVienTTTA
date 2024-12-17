package ui;

import database.khoahoc.CapBacDB;
import database.khoahoc.ChuongTrinhDB;
import model.khoahoc.CapBac;
import model.khoahoc.ChuongTrinh;
import services.ChuongTrinhServices;

public class HomeUI {
    public static void menu() {
        System.out.println("===== HE THONG QUAN LY HOC VIEN TRUNG TAM TIENG ANH =====");
        System.out.println("1: Dang nhap");
        System.out.println("2: Tim kiem khoa hoc");
        System.out.println("3: Xem danh sach khoa hoc");
        System.out.println("4: Xem danh sach lop hoc sap khai giang");
        System.out.println("5: Gui yeu cau tu van");
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

}
