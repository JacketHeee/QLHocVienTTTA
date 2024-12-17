package controller;

import java.util.Scanner;

import database.users.HocVienDB;
import model.user.NguoiDung;
import services.HocVienServices;
import services.UserServices;
import ui.GiaoVienUI;
import ui.HocVienUI;
import ui.TS_GiaoVuUI;

public class UserController {
    private UserServices userService;  // Khai báo đối tượng UserService
    private NguoiDung loggedInUser;  // Đối tượng User lưu thông tin người dùng đã đăng nhập

    // Constructor để khởi tạo UserService
    public UserController() {
        this.userService = new UserServices();
    }
    // Phương thức xử lý đăng nhập
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dang nhap: ");
        String username = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        String password = sc.nextLine();
        
        // Gọi service để kiểm tra thông tin đăng nhập
        loggedInUser = userService.checkLogin(username, password);
        if (loggedInUser != null) {
            System.out.println("Danh nhap thanh cong!");
            // In ra thông tin người dùng
            showUIByRole(loggedInUser);
        } else {
            System.out.println("Sai tai khoan hoac mat khau.");
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
                TS_GiaoVuUI adminUI = new TS_GiaoVuUI();
                // adminUI.dashboard();
                break;
            case 2:
                GiaoVienUI giaoVienUI = new GiaoVienUI();
                // giaoVienUI.dashboard();
                break;
            case 3:
                HocVienDB hocVienDB = new HocVienDB();
                HocVienUI hocVienUI = new HocVienUI();
                // hocVienUI.dashboard(hocVienDB.getHocVienByIDUser(user.getMaNguoiDung()));
                break;
            default:
                System.out.println("Role khong hop le.");
                break;
        }
    }
}


// import java.util.Scanner;

// import database.users.UserDB;
// import model.user.NguoiDung;
// import ui.*;

// public class DangNhapController {
//     public static void main(String[] args) {
//         // DangKyController.UIDangKy();
//         UILogin();
//     }
//     public static void UILogin() {
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("username: ");
//         String username = sc.nextLine(); 
//         System.out.print("password: ");
//         String pass = sc.nextLine(); 
//         NguoiDung x = kiemtraDN(username,pass);
//         if ( x != null) {
//             switch (x.getrole()) {
//                 case 1:
//                      GiaoDien_TuyenSinhGiaoVu.giaoDienChinh();                   
//                 break;
//                 case 2: 
//                     GiaoDien_GiaoVien.giaoDienChinh();
//                 break;
//                 case 3: 
//                     GiaoDien_HocVien.giaoDienChinh();
//                 break;
//             }
//         }
//     }
// }

