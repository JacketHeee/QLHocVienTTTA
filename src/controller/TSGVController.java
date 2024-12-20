package controller;

import java.util.*;

import services.CapBacServices;
import services.LopHocServices;
import services.TSGVServices;
import ui.HocVienUI;
import ui.TS_GiaoVuUI;
import utils.Chuoi;
import utils.Console;
import utils.Sleep;

import model.khoahoc.*;
import model.user.HocVien;

public class TSGVController {
    private TSGVServices tsgvServices;
    private HomeController homeController;
    public static void main(String[] args) {
        TSGVController tsgvController = new TSGVController();
        tsgvController.showMenu();
    }
    
    public TSGVController(HomeController homeController) {
        tsgvServices = new TSGVServices(homeController.getKhoaHocServices(),homeController.getLopHocServices());
        this.homeController = homeController;
    }

    public TSGVController() {
        homeController = new HomeController();
        tsgvServices = new TSGVServices(homeController.getKhoaHocServices(),homeController.getLopHocServices());
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
                    timKiemThongTinHocVien();
                break;
                case '2':
                    timKiemThongTinHocVien();
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
                    // xemHoSoHocVien();
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

    public void ghiDanhChoHocVien(HocVien hv, LopHoc lopHoc) {
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
        ArrayList<LopHoc> list;
        while (true) {
            Console.clearConsole();
            System.out.printf("%-135s\n\n",Chuoi.centerText("---------======= DANH SACH LOP HOC HIEN CO =======--------", 135));
            list = tsgvServices.displayAllLopHoc();
            TS_GiaoVuUI.menu_5();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    System.out.print("So thu tu lop hoc la: ");
                    int stt = Integer.parseInt(sc.nextLine());
                    while (true) {
                        Console.clearConsole();
                        list.get(stt-1).showAllInfor();    
                        System.out.println("---------------------");
                        System.out.println("x: Quay lai");
                        System.out.println("---------------------");
                        System.out.print("Lua chon cua ban la: ");
                        if (sc.nextLine().charAt(0) == 'x') 
                            break;
                    }            
                    break;
                case '2': 
                    System.out.print("So thu tu lop hoc la: ");
                        int stt_2 = Integer.parseInt(sc.nextLine());
                        while (true) {
                            Console.clearConsole();
                            System.out.printf("%-80s\n",Chuoi.centerText("============ DANH SACH HOC VIEN ============", 80));
                            HocVien.displayList(list.get(stt_2-1).getHocViens());   
                            System.out.println("---------------------");
                            System.out.println("x: Quay lai");
                            System.out.println("---------------------");
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
    public void xemHoSoHocVien(HocVien hocVien) {
        System.out.println("con vo biet bay");
        Scanner sc = new Scanner(System.in);
        char choose; 
        while (true) {
            Console.clearConsole();
            hocVien.xemHoSo(); 
            System.out.println("------------------------");
            System.out.println("x: Quay lai");
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
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

    public void timKiemThongTinHocVien() {
        Scanner sc = new Scanner(System.in);
        char choose; 
        while ( true) {
            Console.clearConsole(); 
            System.out.print("Vui long nhap tu khoa tim kiem: ");
            String inputSearch = sc.nextLine(); 
            if (inputSearch.isEmpty()) 
                inputSearch = null;
            inputSearch = Chuoi.formatSearch(inputSearch);

            ArrayList<HocVien> listSearch = tsgvServices.timKiemHocVien(inputSearch);
            System.out.printf("%-80s\n",Chuoi.centerText("================KET QUA TIM KIEM================", 80));
            HocVien.displayList(listSearch);
            TS_GiaoVuUI.menu_2();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    System.out.print("So thu tu hoc vien muon xem la: ");
                    int stt = Integer.parseInt(sc.nextLine());
                    HocVien hv = listSearch.get(stt-1); 
                    xemHoSoHocVien(hv);
                    choose = 'x';
                    break;
                case '2': 
                    System.out.println("");
                    // ghiDanhChoHocVien(null, null);
                    break;
                
                default:
                    break;
            }

            if (choose == 'x') 
                break;
        }
    }
}
