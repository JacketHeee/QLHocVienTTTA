package controller;

import java.util.Scanner;

import database.khoahoc.ChuongTrinhDB;

import java.util.ArrayList;

import model.khoahoc.ChuongTrinh;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import services.ChuongTrinhServices;
import services.KhoaHocServices;
import services.LopHocServices;
import services.UserServices;
import ui.HomeUI;
import utils.Chuoi;
import utils.Console;
import utils.Sleep;

public class HomeController {
    private KhoaHocServices khoaHocServices;
    private LopHocServices lopHocServices;
    public HomeController() {
        khoaHocServices = new KhoaHocServices();
        lopHocServices = new LopHocServices();
    }
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            HomeUI.menu();
            System.out.print("Lua chon cua ban la: ");  
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                    UserController userController = new UserController();
                    userController.login();
                break;
                case '2':
                    System.out.print("\tTu khoa tim kiem la: ");
                    String input = sc.nextLine();
                    Sleep.load();
                    char choose_2 = ' ';
                    while (true) {
                            
                            ArrayList<KhoaHoc> list = timKiemTheoTen(input);
                            HomeUI.menu_2();
                            System.out.print("Lua chon cua ban la: ");      
                            choose_2 = sc.nextLine().charAt(0);
                            showMenuAfterDisplayKhoaHoc(list, choose_2);
                            if (choose_2 == 'x') {
                                break;
                            }
                    }
                    break;
                case '3': 
                    
                    char choose_3;
                    while (true) {
                        Console.clearConsole();
                        HomeUI.menu_3(); 
                        System.out.print("Lua chon cua ban la: ");      
                        choose_3 = sc.nextLine().charAt(0);
                        switch (choose_3) {
                            case '1':
                                char choose_3_1 = ' ';
                                while (true) {
                                    Console.clearConsole();
                                    System.out.println("==============================================DANH SACH KHOA HOC===============================================\n");
                                    ArrayList<KhoaHoc> list = khoaHocServices.displayAllKhoaHoc();
                                    HomeUI.menu_3_afterDisplay();
                                    System.out.print("Lua chon cua ban la: ");      
                                    choose_3_1 = sc.nextLine().charAt(0);
                                    showMenuAfterDisplayKhoaHoc(list, choose_3_1);
                                    if (choose_3_1 == 'x') {
                                        break;
                                    }
                                }
                            break;
                            default: 
                                if (choose_3 != 'x') {
                                    ArrayList<ChuongTrinh> list = (new ChuongTrinhServices()).getChuongTrinhDB().getlistChuongTrinh();
                                        char choose_3_i;
                                    while (true) {
                                        Console.clearConsole();
                                        HomeUI.menu_3_2(); 
                                        System.out.print("Lua chon cua ban la: ");      
                                        choose_3_i = sc.nextLine().charAt(0);
                                        switch (choose_3_i) {
                                            default :
                                                if (choose_3_i != 'x') {
                                                    int ho = Integer.parseInt(choose_3_i+"");
                                                    char choose_3_i_i;
                                                    while (true) {
                                                        Console.clearConsole();
                                                        HomeUI.menu_3_2_i(ho); 
                                                        System.out.print("Lua chon cua ban la: ");      
                                                        choose_3_i_i= sc.nextLine().charAt(0);
                                                        switch (choose_3_i_i) {
                                                            case '1':
                                                            char choose3_i_i_1 = ' ';
                                                            while (true) {
                                                                Console.clearConsole();
                                                                System.out.println("==============================================DANH SACH KHOA HOC===============================================");
                                                                System.out.println(list.get(ho-1).getTenChuongTrinh() + "\n");
                                                                ArrayList<KhoaHoc> list3_i_i_1 = khoaHocServices.displayAllKhoaHocTheoChuongTrinh(list.get(ho-1).getMaChuongTrinh());
                                                                HomeUI.menu_3_afterDisplay();
                                                                System.out.print("Lua chon cua ban la: ");      
                                                                choose3_i_i_1= sc.nextLine().charAt(0);
                                                                showMenuAfterDisplayKhoaHoc(list3_i_i_1, choose3_i_i_1);
                                                                if (choose3_i_i_1 == 'x') {
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                            default: 
                                                                if (choose_3_i_i != 'x') {
                                                                    int hi = Integer.parseInt(choose_3_i_i + "");
                                                                    char choose3_i_i_i = ' ';
                                                                    while (true) {
                                                                        Console.clearConsole();
                                                                        System.out.println("==============================================DANH SACH KHOA HOC===============================================");
                                                                        System.out.println(list.get(ho-1).getTenChuongTrinh() + " > " + list.get(ho-1).getCapBacs().get(hi-2).getTenCapBac() + "\n");
                                                                        ArrayList<KhoaHoc> list3_i_i_i = khoaHocServices.displayAllKhoaHocTheoCapBac(list.get(ho-1).getCapBacs().get(hi-2).getMaCapBac());
                                                                        HomeUI.menu_3_afterDisplay();
                                                                        System.out.print("Lua chon cua ban la: ");      
                                                                        choose3_i_i_i= sc.nextLine().charAt(0);
                                                                        showMenuAfterDisplayKhoaHoc(list3_i_i_i, choose3_i_i_i);
                                                                        if (choose3_i_i_i == 'x') {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            break;
                                                        }
                                                        if (choose_3_i_i == 'x') 
                                                            break;
                                                    }
                                                }
                                                
                                            break;
                                        }
                                        if (choose_3_i == 'x') 
                                            break;
                                    }
                                }
                            break;
                        }
                        if (choose_3 == 'x') 
                            break;
                    }
                    
                break;
                case '4': 
                    char choose_4 = ' ';
                    while (true) {
                        Console.clearConsole();
                        System.out.println("===========================DANH SACH LOP HOC SAP KHAI GIANG=======================\n");
                        ArrayList<LopHoc> list_4 = lopHocServices.displayAllKhoaHocSapKhaiGiang();
                        HomeUI.menu_2_1();
                        System.out.print("Lua chon cua ban la: ");
                        choose_4 = sc.nextLine().charAt(0);
                        switch (choose_4) {
                            case '1':
                                shopMenuLuaChonLopHoc(list_4);
                                break;
                        }
                        if (choose_4 == 'x') 
                            break;
                    }
                break;
            }
            if (choose == 'x') 
                break;
        }
    }

    public ArrayList<KhoaHoc> timKiemTheoTen(String input) {
        String inputSearch = Chuoi.formatSearch(input);
        ArrayList<KhoaHoc> list = khoaHocServices.timKiemTheoTen(inputSearch);
        Console.clearConsole();
        System.out.println("\nKET QUA TIM KIEM CHO TU KHOA \"" + inputSearch + "\" \n");
        khoaHocServices.displayList(list);
        return list;
    }

    public static void main(String[] args) {
        HomeController homeController = new HomeController(); 
        homeController.showMenu();
    }

    public void showMenuAfterDisplayKhoaHoc(ArrayList<KhoaHoc> list,char choose_2) {
        Scanner sc = new Scanner(System.in);
        switch (choose_2) {
            case '1':
                System.out.print("\tSo thu tu khoa hoc la: ");
                int stt = Integer.parseInt(sc.nextLine());
                char choose_2_1;
                while (true) {
                    Console.clearConsole();
                    list.get(stt-1).showAllInfor();
                    HomeUI.menu_2_1();
        
                    System.out.print("Lua chon cua ban la: ");      
                    choose_2_1 = sc.nextLine().charAt(0);
                    switch (choose_2_1) {
                        case '1':
                            shopMenuLuaChonLopHoc(list.get(stt-1).getLopHocSapKhaiGiang());
                        break;
                        case '2':
                        break;
                    }
                    if (choose_2_1 == 'x') 
                        break;
                }
            break;
            case '2':
            break;
        }
    }

    public void shopMenuLuaChonLopHoc(ArrayList<LopHoc> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tSo thu tu lop hoc la: ");
        int sttLop = Integer.parseInt(sc.nextLine());
        char choose_2_1_1;
        while (true) {
            Console.clearConsole();
            list.get(sttLop-1).showAllInfor();
            HomeUI.menu_2_1_1();
            
            System.out.print("Lua chon cua ban la: ");      
            choose_2_1_1 = sc.nextLine().charAt(0);
            switch (choose_2_1_1) {
                case '1':
                    System.out.println("Da gui yeu cau tu van");
                    Sleep.load();
                break;
            }
            if (choose_2_1_1 == 'x') 
                break;
        }
    }
}   
