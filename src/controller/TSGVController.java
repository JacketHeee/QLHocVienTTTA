package controller;

import java.util.*;

import services.CapBacServices;
import services.TSGVServices;
import ui.HocVienUI;
import ui.TS_GiaoVuUI;
import utils.Console;
import utils.Sleep;

import model.khoahoc.*;

public class TSGVController {
    private TSGVServices tsgvServices;
    private HomeController homeController;
    
    public TSGVController(HomeController homeController) {
        tsgvServices = new TSGVServices(homeController.getKhoaHocServices(),homeController.getLopHocServices());
        this.homeController = homeController;
    }

    public TSGVController() {
        homeController = new HomeController();
        tsgvServices = new TSGVServices(homeController.getKhoaHocServices(),homeController.getLopHocServices());
    }
    public static void main(String[] args) {
        TSGVController tsgvController = new TSGVController();
        tsgvController.showMenu();
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            TS_GiaoVuUI.menu();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                    nhapThongTinUngVien();
                break;
                case '2':
                    ghiDanhChoHocVien();
                break;
                case '3': 
                    xepLopChoHocVienDongTienNhieuKhoa();
                break;
                case '4': 
                    baoCaoThongKe();
                break;
                case '5': 
                    xemDanhSachLopHoc();
                    break;
                case '6': 
                    xemHoSoHocVien();
                    break;
                case '7': 
                    datLichKiemTraDauVaoChoGiaoVien(); 
                    break;
                case '8': 
                    sapXepLopChoGiaoVien();
                    break;
                case '9': 
                    chuyenDoiLopChoGiaoVien();
                    break;
            }
            if (choose == 'x') {
                Console.clearConsole();
                Sleep.dangXuat();
                break;
            }
        }
    }

    public void nhapThongTinUngVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void ghiDanhChoHocVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void xepLopChoHocVienDongTienNhieuKhoa() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void baoCaoThongKe() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            TS_GiaoVuUI.menu_4();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    thongKeSoLuongHocVienMoiLop();
                    break;
                case '2': 
                    thongKeSoLuongHocVienMoiKhoaTheoTunCapbac();
                    break;
                    
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void xemDanhSachLopHoc() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void xemHoSoHocVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void datLichKiemTraDauVaoChoGiaoVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void sapXepLopChoGiaoVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void chuyenDoiLopChoGiaoVien() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        while (true) {
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }

    public void thongKeSoLuongHocVienMoiLop() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        ArrayList<LopHoc> list = homeController.getLopHocServices().getlistLopHoc();
        while (true) {
            Console.clearConsole();
            // TS_GiaoVuUI.menu_4_i_i();
            System.out.println("==================================THONG KE HOC VIEN THEO MOI LOP==================================\n");
            LopHoc.displayListThongKeTheoLop(list);
            System.out.println("x: Quay lai");
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
    public void thongKeSoLuongHocVienMoiKhoaTheoTunCapbac() {
        Scanner sc = new Scanner(System.in);
        Console.clearConsole();
        char choose; 
        ArrayList<CapBac> list = tsgvServices.getlistCapBac();            
        while (true) {
            Console.clearConsole();
            tsgvServices.displayListHocVienTheoKhoaHoc(list);
            TS_GiaoVuUI.menu_4_i_i();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    
                    break;
            
                default:
                    break;
            }
            if (choose == 'x') 
                break;
        }
    }
}
