package ui;

import java.util.Scanner;

public class HocVienUI {
    public void displayMenu() {
        System.out.println("=== Menu Hoc Vien ===");
        System.out.println("1. Xem thong tin khoa hoc");
        System.out.println("2. Dang ky khoa hoc");
        System.out.println("3. Xem lop hoc da dang ky");
        System.out.println("4. Xem thong tin ca nhan");
        System.out.println("x. Dang xuat");
    }

    public String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap lua chon cua ban: ");
        return scanner.nextLine();
    }
}
