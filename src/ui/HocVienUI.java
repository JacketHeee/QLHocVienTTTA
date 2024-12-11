package ui;

import java.util.Scanner;

import model.user.HocVien;

public class HocVienUI {
    public void dashboard(HocVien hv) {
        Scanner sc = new Scanner(System.in); 
        char choose;
        while (true) {
            clearConsole();
            System.out.println("=== Menu Hoc Vien ===");
            System.out.println("1. Xem thong tin khoa hoc");
            System.out.println("2. Dang ky khoa hoc");
            System.out.println("3. Xem lop hoc da dang ky");
            System.out.println("4. Xem thong tin ca nhan");
            System.out.println("x. Dang xuat"); 

        // Đăng nhập
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                break;
                case '2':
                break;
                case '3': 
                break;
                case '4': 
                    hv.show();
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
