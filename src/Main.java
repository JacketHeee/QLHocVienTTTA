import java.util.Scanner;

import controller.HomeController;
import controller.UserController;
import model.user.NguoiDung;
import ui.HomeUI;

public class Main {
    public static void main(String[] args) {
        clearConsole();
        HomeController homeController = new HomeController();
        homeController.showMenu();
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
