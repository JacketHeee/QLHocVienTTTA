package controller;

import services.KhoaHocServices;
import services.LopHocServices;
import ui.HomeUI;

public class HomeController {
    private HomeUI homeUI;
    
    public HomeController() {
        homeUI = new HomeUI();
    }
    public void showMenu() {
        while (true) {
            homeUI.displayMenu();
            String choice = homeUI.getUserChoice();

            switch (choice) {
                case "1":
                    // Chuyển đến UI đăng nhập
                    System.out.println("Chuyen sang giao dien dang nhap...");
                    break;
                case "2":
                    // Xử lý tìm kiếm khóa học
                    System.out.println("Tim kiem khoa hoc...");
                    break;
                case "3":
                    // Hiển thị các khóa học hiện có
                    System.out.println("Hien thi danh sach khoa hoc...");
                    break;
                case "4":
                    // Hiển thị các lớp học hiện có
                    System.out.println("Hien thi danh sach lop hoc...");
                    break;
                case "x":
                    System.out.println("Thoat chuong trinh...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        }
    }
}   
