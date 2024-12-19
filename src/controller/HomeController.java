package controller;

import java.util.Scanner;

import database.khoahoc.ChuongTrinhDB;

import java.util.ArrayList;
import java.util.List;

import model.chinhanh_phonghoc.ChiNhanh;
import model.khoahoc.ChuongTrinh;
import model.khoahoc.KhoaHoc;
import model.khoahoc.LopHoc;
import model.lichhoc.GioHoc;
import model.user.HocVien;
import services.ChuongTrinhServices;
import services.KhoaHocServices;
import services.LopHocServices;
import services.UserServices;
import ui.HomeUI;
import utils.Chuoi;
import utils.Console;
import utils.Generate;
import utils.Sleep;

public class HomeController {
    private KhoaHocServices khoaHocServices;
    private LopHocServices lopHocServices;
    private HocVien hv;
    public HomeController() {
        khoaHocServices = new KhoaHocServices();
        lopHocServices = new LopHocServices();
        hv = null;
    }

    public HomeController(HocVien hv) {
        khoaHocServices = new KhoaHocServices();
        lopHocServices = new LopHocServices();
        this.hv = hv;
    }

    
    
    public HocVien getHv() {
        return hv;
    }



    public void setHv(HocVien hv) {
        this.hv = hv;
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
                    Sleep.load();
                    dangNhap();
                break;
                case '2':
                    timKiemKhoaHoc();
                    break;
                case '3': 
                    Sleep.load();
                    xemDanhSachKhoaHoc();
                break;
                case '4': 
                    Sleep.load();
                   xemDanhSachLopHocSapKhaiGiang();
                break;
                case '5': 
                    guiYeuCauTuVAn();
                break;
                case '6': 
                    Sleep.load();
                    timKiemLopHoc();
            }
            if (choose == 'x') 
                break;
        }
    
    }

    public void dangNhap() {
        UserController userController = new UserController(this);
        userController.login();
    }

    public void guiYeuCauTuVAn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dang gui yeu cau tu van");
        Sleep.load(500);
        Console.clearConsole();
        System.out.println("Da gui yeu cau tu van!");
        System.out.print("================ENTER de tiep tuc ==================");
        sc.nextLine();
    }

    public void xemDanhSachLopHocSapKhaiGiang() {
        Scanner sc = new Scanner(System.in);
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
    }

    public void xemDanhSachKhoaHoc() {
        Scanner sc = new Scanner(System.in);
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
    }

    public void timKiemKhoaHoc() {
        Scanner sc = new Scanner(System.in);
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
    }

    public void timKiemLopHoc() {
        Scanner sc = new Scanner(System.in);
        ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB();
        ChuongTrinh ct; 
        GioHoc gh;
        ChiNhanh cn; 
        char choose; 
        while (true) {
            Console.clearConsole();
            System.out.println("========================Bat dau tim kiem======================");
            HomeUI.menu_6();
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    Console.clearConsole();
                    System.out.println("=================TIM KIEM LOP HOC================\n");
                    HomeUI.menu_ChuongTrinh();
                    System.out.print("Lua chon cua ban la: ");
                    char cct = sc.nextLine().charAt(0); 
                    if (cct == 'c') {
                        ct = null;
                    }
                    else {
                        ct = chuongTrinhDB.getlistChuongTrinh().get(Integer.parseInt(cct+"")-1);
                    }
                    System.out.println("");

                    ArrayList<GioHoc> listgh = HomeUI.menu_GioHoc();
                    System.out.print("Lua chon cua ban la: ");
                    cct = sc.nextLine().charAt(0);
                    if (cct == 'c') {
                        gh = null;
                    }
                    else {
                        gh = listgh.get(Integer.parseInt(cct+"")-1);
                    }

                    System.out.println("");
                    ArrayList<ChiNhanh> listcn = HomeUI.menu_ChiNhanh();
                    System.out.print("Lua chon cua ban la: ");
                    cct = sc.nextLine().charAt(0);
                    if (cct == 'c') {
                        cn = null;
                    }
                    else {
                        cn = listcn.get(Integer.parseInt(cct+"")-1);
                    }

                    ArrayList<LopHoc> listlh = lopHocServices.timKiemLopHoc(ct, gh, cn);
                    char chooseLop;
                    while (true) {
                        Console.clearConsole();
                        System.out.println("=========================================KET QUA TIM KIEM LOP==========================================\n");
                        if (listlh.size() != 0) 
                            lopHocServices.displayList(listlh);
                        else 
                            System.out.println("KHONG CO LOP HOC PHU HOP!!!!!!!!!!!!!\n");
                        HomeUI.menu_2_1();
                        System.out.print("Lua chon cua ban la: ");
                        chooseLop = sc.nextLine().charAt(0);
                        switch (chooseLop) {
                            case '1':
                                shopMenuLuaChonLopHoc(listlh);  
                                break;
                            
                            case '3': 
                                HomeUI.menu_ChuongTrinh();
                                System.out.print("Lua chon cua ban la: ");
                                cct = sc.nextLine().charAt(0); 
                                if (cct == 'c') {
                                    ct = null;
                                }
                                else {
                                    ct = chuongTrinhDB.getlistChuongTrinh().get(Integer.parseInt(cct+"")-1);
                                }
                                System.out.println("");
            
                                HomeUI.menu_GioHoc();
                                System.out.print("Lua chon cua ban la: ");
                                cct = sc.nextLine().charAt(0);
                                if (cct == 'c') {
                                    gh = null;
                                }
                                else {
                                    gh = listgh.get(Integer.parseInt(cct+"")-1);
                                }
            
                                System.out.println("");
                                HomeUI.menu_ChiNhanh();
                                System.out.print("Lua chon cua ban la: ");
                                cct = sc.nextLine().charAt(0);
                                if (cct == 'c') {
                                    cn = null;
                                }
                                else {
                                    cn = listcn.get(Integer.parseInt(cct+"")-1);
                                }
                                listlh = lopHocServices.timKiemLopHoc(listlh, ct, gh, cn);
                            break;
                        
                            default:
                                break;
                        }
                        if (chooseLop == 'x') 
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
                case '2': 
                    formThanhtoan(hv, null);
                    break;
            }
            if (choose_2_1_1 == 'x') 
                break;
        }
    }

    public void formThanhtoan(HocVien hv, ArrayList<LopHoc> list) {
        Scanner sc = new Scanner(System.in);
        String name,sdt,email;
        Console.clearConsole();
        System.out.println("===========================THANH TOAN=========================");
        if (hv == null) {
            System.out.print("\033[1mHo ten: \033[0m");
            name = sc.nextLine(); 
            System.out.print("\033[1mSo dien thoai: \033[0m");
            sdt = sc.nextLine(); 
            System.out.print("\033[1mEmail: \033[0m");
            email = sc.nextLine();
            
        } else {
            System.out.print("\033[1mHo ten: \033[0m");
            name = hv.getHoten(); 
            System.out.println(name);
            System.out.print("\033[1mSo dien thoai: \033[0m");
            sdt = hv.getMaNguoiDung().getSoDienthoai(); 
            System.out.println(sdt);
            System.out.print("\033[1mEmail: \033[0m");
            email = hv.getMaNguoiDung().getEmail();
            System.out.println(email);
        }

        System.out.println("\033[1mDanh sach lop hoc: \033[0m");
        // for (LopHoc x : list) 
        //     x.show();
        // System.out.println("Chon khuyen mai: "); //lựa chọn phát triển

        System.out.println("\033[1mPhuong thuc thanh toan: \033[0m ");
        String[] phthuc = {"Tien mat","Chuyen khoan"};
        int index=1;
        for (String  x : phthuc) 
            System.out.printf("%d: %s\n",index,phthuc[index++ -1]);
        System.out.print("Lua chon cua ban la: ");       
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                Sleep.load(500);
                Sleep.load(500);
                break;
        
            case 2: 
                Sleep.load(500);
                Console.clearConsole();
                System.out.println("================ VUI LONG QUET MA QR DE THANH TOAN ================\n\n");
                Generate.generateQRCode(15, 20);
                Sleep.tamDung(3000);
                Sleep.load(500);
                Sleep.load(500);
                break;
        }

        Console.clearConsole();
        System.out.println("\033[1mDa xac thuc thanh toan!\033[0m");
        if (hv == null) {
            System.out.println("Tai khoan cua ban da duoc gui qua Email va SMS.");
            System.out.println("Dang nhap lan dau va doi mat khau de dam bao bao mat nhe!!!");
        }
        System.out.println("------------------------------------------");
        char choose;
        while (true) {
            System.out.println("1: Xem hoa don thanh toan");
            System.out.println("x: Quay lai");
            System.out.println("-------------------------");
            System.out.print("Lua chon cua ban la: ");
            choose = sc.nextLine().charAt(0);
            switch (choose) {
                case '1':
                    Console.clearConsole();
                    System.out.println("Xem hoa don thanh toan");
                    break;
                default:
                    break;
            }
            if (choose == 'x')  
                break;
        }
    }
}   
