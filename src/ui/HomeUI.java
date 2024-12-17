package ui;

import java.util.Scanner;

import controller.HomeController;
import controller.UserController;

public class HomeUI {
    public void displayMenu() {
        System.out.println("=== Home ===");
        System.out.println("1. Dang nhap");
        System.out.println("2. Tim kiem khoa hoc");
        System.out.println("3. Xem cac khoa hoc hien co");
        System.out.println("4. Xem cac lop hoc hien co");
        System.out.println("x. Thoat");
    }

    public String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap lua chon cua ban: ");
        return scanner.nextLine();
    }
}
