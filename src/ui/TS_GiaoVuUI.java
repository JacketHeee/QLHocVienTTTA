package ui;

import java.util.Scanner;

import model.user.TuyenSinh_GiaoVu;

public class TS_GiaoVuUI {
    public static void dashboard(TuyenSinh_GiaoVu tsgv) {
        Scanner sc = new Scanner(System.in); 
        char choose;
        while (true) {
            clearConsole();
            System.out.println("=== Tuyen sinh Giao vu ===");
            System.out.println("1: Quan ly tai khoan hoc vien va giao vien");
            System.out.println("2: Quan ly Khoa hoc");
            System.out.println("x: Dang xuat");
            
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                break;
                case '2':
                break;
                case '3': 
                break;
            }
            if (choose == 'x') 
                break;
            System.out.println("-------Enter de tiep tuc-----");
            sc.nextLine();
        } 
    }

    public static void clearConsole() {
        try {
            // Lệnh để xóa màn hình trên Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            // Lệnh để xóa màn hình trên Unix-based hệ thống (Linux/Mac)
            else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
