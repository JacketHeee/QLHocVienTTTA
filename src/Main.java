import java.util.Scanner;

import controller.UserController;
import model.user.NguoiDung;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserController userController = new UserController(); 
        char choose;
        while (true) {
            clearConsole();
            System.out.println("=== Home ===");
            System.out.println("1. Tim kiem khoa hoc");
            System.out.println("2. Xem cac khoa hoc hien co");
            // System.out.println("3. Xem lop hoc da dang ky");
            System.out.println("3. Dang nhap"); 
            System.out.println("x. Thoat"); 
            
        // Đăng nhập
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                break;
                case '2':
                break;
                case '3': 
                userController.login();
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
