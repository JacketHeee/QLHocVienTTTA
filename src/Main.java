import java.util.Scanner;

import controller.HomeController;
import controller.UserController;
import model.user.NguoiDung;
import ui.HomeUI;

public class Main {
    public static void main(String[] args) {
        // clearConsole();
        // HomeUI homeUI = new HomeUI();
        // homeUI.dashboard();
        // Scanner sc = new Scanner(System.in);
        
        Scanner sc = new Scanner(System.in);
        char choose;
        while (true) {
            clearConsole();
            System.out.println("=== Home ===");
            System.out.println("1. Dang nhap"); 
            System.out.println("2. Tim kiem khoa hoc");
            System.out.println("3. Xem cac khoa hoc hien co");
            System.out.println("4. Xem cac lop hoc hien co"); 
            System.out.println("x. Thoat");
            UserController userController = new UserController(); 
        // Đăng nhập
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                userController.login();
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
        sc.close();
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
