package controller;

import java.util.Scanner;

import database.users.GiaoVienDB;
import database.users.HocVienDB;
import model.user.NguoiDung;
import services.HocVienServices;
import services.UserServices;
import ui.GiaoVienUI;
import ui.HocVienUI;
import ui.TS_GiaoVuUI;
import utils.Console;
import utils.Sleep;

public class UserController {
    private UserServices userService;  // Khai báo đối tượng UserService
    private NguoiDung loggedInUser;  // Đối tượng User lưu thông tin người dùng đã đăng nhập
    private HomeController homeController;

    // Constructor để khởi tạo UserService
    public UserController(HomeController homeController) {
        this.userService = new UserServices();
        this.homeController = homeController;
    }
    // Phương thức xử lý đăng nhập
    public void login() {
        Console.clearConsole();
        System.out.println("==============GIAO Dien DANG NHap===================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten dang nhap: ");
        String username = sc.nextLine();
        System.out.print("Mat khau: ");
        String password = sc.nextLine();
        
        // Gọi service để kiểm tra thông tin đăng nhập
        loggedInUser = userService.checkLogin(username, password);
        if (loggedInUser != null) {
            Console.clearConsole();
            Sleep.dangNhap();
            // In ra thông tin người dùng
            showUIByRole(loggedInUser);
        } else {
            System.out.println("Sai tai khoan hoac mat khau.");
            Sleep.tamDung(1000);
            this.login();
        }
    }

    // Phương thức lấy thông tin người dùng đã đăng nhập
    public NguoiDung getLoggedInUser() {
        return loggedInUser;
    }

    private void showUIByRole(NguoiDung user) {
        switch (user.getrole()) {
            case 1:
                TSGVController tsgvController = new TSGVController();
                tsgvController.showMenu();
                break;
            case 2:
                GiaoVienDB giaoVienDB = new GiaoVienDB();
                GiaoVienController giaoVienController = new GiaoVienController(giaoVienDB.getGiaoVienByID(user.getMaNguoiDung()));
                giaoVienController.showMenu();
                break;
            case 3:
                HocVienDB hocVienDB = new HocVienDB();
                HocVienController hocVienController = new HocVienController(hocVienDB.getHocVienByIDUser(user.getMaNguoiDung()),homeController);
                hocVienController.showMenu();
               break;
            default:
                System.out.println("Role khong hop le.");
                break;
        }
    }
}


