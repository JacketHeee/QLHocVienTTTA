package controller;
import ui.HocVienUI;
import model.user.HocVien; // Lớp model chứa thông tin học viên

public class HocVienController {
    private HocVien hocVien; // Thuộc tính chứa thông tin học viên
    private HocVienUI hocVienUI = new HocVienUI();

    public HocVienController(HocVien hocVien) {
        this.hocVien = hocVien; // Nhận đối tượng học viên khi tạo controller
    }
    
    public void showMenu() {
        while (true) {
            hocVienUI.displayMenu();
            String choice = hocVienUI.getUserChoice();

            switch (choice) {
                case "1":
                    // Hiển thị thông tin khóa học
                    System.out.println("Hien thi thong tin khoa hoc...");
                    break;
                case "2":
                    // Chuyển đến giao diện đăng ký khóa học (giống Home)
                    System.out.println("Dang ky khoa hoc...");
                    // Có thể tái sử dụng menu Home nhưng thay "Đăng nhập" bằng "Đăng xuất".
                    break;
                case "3":
                    // Hiển thị các lớp học đã đăng ký
                    System.out.println("Hien thi danh sach lop hoc da dang ky...");
                    break;
                case "4":
                    // Hiển thị thông tin cá nhân
                    System.out.println("Hien thi thong tin ca nhan...");
                    break;
                case "x":
                    System.out.println("Dang xuat...");
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        }
    }
}

