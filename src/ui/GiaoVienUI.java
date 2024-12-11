package ui;

import java.util.Scanner;

import model.user.GiaoVien;

public class GiaoVienUI {
    public void dashboard(GiaoVien gv) {
        Scanner sc = new Scanner(System.in); 
        char choose;
        while (true) {
            clearConsole();
            System.out.println("=== Giang vien ===");
            System.out.println("1: Xem lich phong van trinh do dau vao");
            System.out.println("2: Xem lich day cua minh theo khoa hien tai va theo khoa sap khai giang");
            System.out.println("3: Xem danh sach hoc vien theo tung lop");
            System.out.println("x: Dang xuat");
            
        // Đăng nhập
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