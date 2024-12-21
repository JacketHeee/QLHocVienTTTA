package ui;

import java.util.Scanner;

import model.user.GiaoVien;

public class GiaoVienUI {
    public static void menu() {
        System.out.println("============GIAO DIEN GIAO VIEN============");
        System.out.println("1: Xem thong tin ca nhan");
        System.out.println("2: Xem lich giang day");
        System.out.println("3: (Tinh nang dang phat trien)");
        System.out.println("4: Xem va tai tai lieu (Dang phat trien)");
        System.out.println("5: Gui thong bao cho hoc vien (Dang phat trien)");
        System.out.println("6: Xem lich giang day ca nhan (Dang phat trien)");
        System.out.println("7: Xem thong bao (Dang phat trien)");
        System.out.println("x: Dang xuat");
        System.out.println("------------------------");
    }

    public static void menu_1() {

    }

    public static void menu_2() {
        System.out.println("==================LICH GIANG DAY CA NHAN================="); 
        System.out.println("1: Lich giang day hien tai");
        System.out.println("2: Lich giang day khoa sap khai giang");
        System.out.println("x: Quay lai");
        System.out.println("---------------------------------------------");
    }

    public static void menu_2_i() {
        System.out.println("---------------------------");
        System.out.println("1: Xem chi tiet lop hoc");
        System.out.println("2: Xem danh sach hoc vien");
        System.out.println("3: Nhap diem va danh gia hoc vien");
        System.out.println("x: Quay lai");
        System.out.println("----------------------------");

    }    
}