package controller;

import java.util.Scanner;
import java.util.ArrayList;

import model.user.GiaoVien;
import model.user.HocVien;
import services.GiaoVienServices;
import ui.GiaoVienUI;
import utils.Chuoi;
import utils.Console;
import utils.Sleep;
import model.khoahoc.*;

public class GiaoVienController {
    private GiaoVien giaoVien; // Thuộc tính chứa thông tin học viên
    private GiaoVienServices giaoVienServices;
    HomeController homeController;
    public GiaoVienController(GiaoVien giaoVien, HomeController homeController) {
        this.homeController = homeController;
        this.giaoVien = giaoVien; // Nhận đối tượng học viên khi tạo controller
        giaoVienServices = new GiaoVienServices(homeController.getLopHocServices());
        giaoVienServices.themLopHocVaoGiangVien(giaoVien);
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            GiaoVienUI.menu();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':
                    xemThongTinCaNhan(); 
                break;
                case '2':
                    xemLichGiangDay();
                break;
                case '3': 
                break;
            }
            if (choose == 'x') {
                Console.clearConsole();
                Sleep.dangXuat();
                break;
            }
        }
    }

    public void xemThongTinCaNhan() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            giaoVien.show();
            System.out.println("------------------------------");
            System.out.println("x: Quay lai");
            System.out.println("------------------------------");
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            if (choose == 'x') 
                break;
        }
    }
    public void xemLichGiangDay() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            GiaoVienUI.menu_2();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':
                    xemLichGiangDayHienTai();
                    break;
                case '2':
                    xemLichGiangDayKhoaSapKhaiGiang();
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }

    public void xemLichGiangDayHienTai() {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> list = giaoVienServices.getLopHocHienTai(giaoVien);
        char choose; 
        while (true) {
            Console.clearConsole();
            if (list.size() == 0) {
                System.out.println("*Khong co lop");
            }
            else 
                LopHoc.displayListInHoaDon(list);
            GiaoVienUI.menu_2_i();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0); 
            int stt;
            switch (choose) {
                case '1':
                    while (true) {
                        System.out.print("So thu tu lop hoc la: ");
                        stt = Integer.parseInt(sc.nextLine()); 
                        Console.clearConsole();
                        list.get(stt-1).showAllInfor();
                        System.out.println("------------------------");
                        System.out.println("x: Quay lai");
                        System.out.println("------------------------");
                        System.out.print("Lua chon cua ban la: ");
                        if (sc.nextLine().charAt(0) == 'x') 
                            break;
                    }           
                    break;
                    case '2': 
                        while (true) {
                            System.out.print("So thu tu lop hoc la: ");
                            stt = Integer.parseInt(sc.nextLine()); 
                            Console.clearConsole();
                            HocVien.displayList(list.get(stt-1).getHocViens());
                            System.out.println("------------------------");
                            System.out.println("x: Quay lai");
                            System.out.println("------------------------");
                            System.out.print("Lua chon cua ban la: ");
                            if (sc.nextLine().charAt(0) == 'x') 
                                break;
                        }           
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void xemLichGiangDayKhoaSapKhaiGiang() {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> list = giaoVienServices.getLopHocSapKhaiGiang(giaoVien);
        char choose; 
        while (true) {
            Console.clearConsole();
            if (list.size() == 0) {
                System.out.println("*Khong co lop");
            }
            else {
                System.out.printf("%-71s\n\n",Chuoi.centerText("===========LICH GIANG DAY SAP TOI===========", 71));
                LopHoc.displayListInHoaDon(list);
            }
            GiaoVienUI.menu_2_i();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0); 
            int stt;
            switch (choose) {
                case '1':
                    while (true) {
                        System.out.print("So thu tu lop hoc la: ");
                        stt = Integer.parseInt(sc.nextLine()); 
                        Console.clearConsole();
                        list.get(stt-1).showAllInfor();
                        System.out.println("------------------------");
                        System.out.println("x: Quay lai");
                        System.out.println("------------------------");
                        System.out.print("Lua chon cua ban la: ");
                        if (sc.nextLine().charAt(0) == 'x') 
                            break;
                    }           
                    break;
                    case '2': 
                        while (true) {
                            System.out.print("So thu tu lop hoc la: ");
                            stt = Integer.parseInt(sc.nextLine()); 
                            Console.clearConsole();
                            System.out.printf("%-80s\n\n",Chuoi.centerText("===============DANH SACH HOC VIEN==============", 71));
                            HocVien.displayList(list.get(stt-1).getHocViens());
                            System.out.println("------------------------");
                            System.out.println("x: Quay lai");
                            System.out.println("------------------------");
                            System.out.print("Lua chon cua ban la: ");
                            if (sc.nextLine().charAt(0) == 'x') 
                                break;
                        }           
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
}
