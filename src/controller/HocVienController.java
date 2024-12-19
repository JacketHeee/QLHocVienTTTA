package controller;

import utils.Date;
import java.util.ArrayList;
import java.util.Scanner;

import ui.HocVienUI;
import utils.Console;
import utils.Sleep;
import model.khoahoc.LopHoc;
import model.lichhoc.KhoaKhaiGiang;
import model.person.NgayThangNam;
import model.user.HocVien; // Lớp model chứa thông tin học viên
import services.HocVienServices;
import services.LopHocServices;

public class HocVienController {
    private HocVien hocVien; // Thuộc tính chứa thông tin học viên
    private HocVienServices hocVienServices;
    private HomeController homeController;
    public HocVienController(HocVien hocVien, HomeController homeController) { // Nhận đối tượng học viên khi tạo controller
        hocVienServices = new HocVienServices(hocVien);
        this.hocVien = hocVien;
        this.homeController = homeController;
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            HocVienUI.menu();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':
                    Sleep.load();
                    xemThongTinTaiKhoan();
                break;
                case '2':
                    Sleep.load();
                    xemDanhSachKhoaHocDaDangKy();
                break;
                case '3':
                    Sleep.load(); 
                    xemDiemVaTrangThai();
                break;
                case '4': 
                    Sleep.load();
                    Console.clearConsole();
                    System.out.println("TINH NANG DANG PHAT TRIEN");
                    System.out.println("=======ENTER DE TIEP TUC==========");
                    sc.nextLine();
                case '5': 
                    dangKyKhoaHocMoi();
                    break;
            }
            if (choose == 'x') {
                Console.clearConsole();
                Sleep.dangXuat();
                break;
            }
        }
    }

    public void xemThongTinTaiKhoan() {
        Scanner sc = new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            hocVien.show();
            HocVienUI.menu_1();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':
                    System.out.println("Dang cap nhat");
                    Sleep.load(500);
                    Console.clearConsole();
                    System.out.println("Da cap nhat tai khoan!");
                    Sleep.load(500);
                break;
                case '2':
                    System.out.println("Dang doi mat khau");
                    Sleep.load(500);
                    Console.clearConsole();
                    System.out.println("Da doi mat khau!");
                    Sleep.load(500);
                break;
                case '3': 
                break;
            }
            if (choose == 'x') {
                break;
            }
        }
    }

    public void xemDanhSachKhoaHocDaDangKy() {
        LopHocServices lopHocServices = new LopHocServices(); 
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> list = new ArrayList<>();
        // NgayThangNam datenow = Date.now();
        NgayThangNam datenow = new NgayThangNam("1","10","2024");
        for (LopHoc x : hocVien.getLopHocs()) 
            if (x.getkhoaKhaiGiang().getThoiGianBatDau().compareTo(datenow) <= 0 && x.getkhoaKhaiGiang().getThoiGianKetThuc().compareTo(datenow) >= 0)
                list.add(x);
        char choose;
        while (true) {
            Console.clearConsole();
            System.out.println("====================================DANH SACH KHOA HOC DANG HOC======================================\n");
            lopHocServices.displayList(list);
            HocVienUI.menu_2();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    System.out.print("\tSo thu tu lop hoc la: ");
                    int sttLop = Integer.parseInt(sc.nextLine());
                    char choose_2_1_1;
                    while (true) {
                        Console.clearConsole();
                        list.get(sttLop-1).showAllInfor();
                        HocVienUI.menu_2_1_after();
                        System.out.print("Lua chon cua ban la: ");      
                        choose_2_1_1 = sc.nextLine().charAt(0);
                        if (choose_2_1_1 == 'x') 
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

    public void xemDiemVaTrangThai() {
        ArrayList<KhoaKhaiGiang> list = hocVienServices.getKhoaKhaiGiangHienco();
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            System.out.println("====================================XEM KET QUA HOC TAP================================\n\n");
            hocVienServices.displayTheoDoiHocTapByKhoaKG(list);
            System.out.println("------------------------");
            System.out.println("x: Quay lai");
            System.out.println("------------------------");
            System.out.print("Lua cho cua ban la: ");
            choose = sc.nextLine().charAt(0);
            if (choose == 'x') 
                break;
        }
    }

    public void dangKyKhoaHocMoi() {
        Sleep.load();
        Scanner sc = new Scanner(System.in);
        
        homeController.setHv(hocVien);
        
        char choose;
        
        while (true) {
            Console.clearConsole();
            HocVienUI.menu_5();

            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            
            switch (choose) {
                case '1':
                    Sleep.load();
                    homeController.timKiemLopHoc();
                    break;
                case '2': 
                    Sleep.load();
                    homeController.xemDanhSachLopHocSapKhaiGiang();
                    break;
                case '3':
                    Sleep.load();
                    homeController.timKiemKhoaHoc();
                    break;
                case '4': 
                    Sleep.load();
                    homeController.xemDanhSachKhoaHoc();
                    break;
            }

            if (choose == 'x') 
                break;
        }
    }
}



