package controller;

import java.util.Scanner;
import java.util.ArrayList;

import model.khoahoc.KhoaHoc;
import services.KhoaHocServices;

import services.UserServices;
import ui.HomeUI;
import utils.Chuoi;
import utils.Console;
import utils.Sleep;

public class HomeController {
    private KhoaHocServices khoaHocServices;
    public HomeController() {
        khoaHocServices = new KhoaHocServices();
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
                char choose_2;
                while (true) {
                        
                        ArrayList<KhoaHoc> list = timKiemTheoTen(input);
                        HomeUI.menu_2();
                        System.out.print("Lua chon cua ban la: ");      
                        choose_2 = sc.nextLine().charAt(0);
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
                                            System.out.print("\tSo thu tu lop hoc la: ");
                                            int sttLop = Integer.parseInt(sc.nextLine());
                                            char choose_2_1_1;
                                            while (true) {
                                                Console.clearConsole();
                                                list.get(stt-1).getLopHocSapKhaiGiang().get(sttLop-1).showAllInfor();
                                                HomeUI.menu_2_1_1();
                                                
                                                System.out.print("Lua chon cua ban la: ");      
                                                choose_2_1_1 = sc.nextLine().charAt(0);
                                                switch (choose_2_1_1) {
                                                    case '1':
                                                        System.out.println("Da ghi danh");
                                                        Sleep.load();
                                                    break;
                                                    case '2':
                                                        System.out.println("Da gui yeu cau tu van");
                                                        Sleep.load();
                                                    break;
                                                }
                                                if (choose_2_1_1 == 'x') 
                                                    break;
                                            }
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
                        if (choose_2 == 'x') 
                            break;
                        // System.out.print("-------Enter de tiep tuc-----");
                        // sc.nextLine();
                    }
                break;
                case '3': 
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
}   
