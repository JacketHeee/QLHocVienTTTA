package auth;

import java.util.Scanner;

import model.NguoiDung;
import database.UserDB;
import ui.*;

public class DangNhapController {
    public static void main(String[] args) {
        DangKyController.UIDangKy();
        UILogin();
    }
    public static void UILogin() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("username: ");
        String username = sc.nextLine(); 
        System.out.print("password: ");
        String pass = sc.nextLine(); 
        NguoiDung x = kiemtraDN(username,pass);
        if ( x != null) {
            switch (x.getrole()) {
                case 1:
                     GiaoDien_TuyenSinhGiaoVu.giaoDienChinh();                   
                break;
                case 2: 
                    GiaoDien_GiaoVien.giaoDienChinh();
                break;
                case 3: 
                    GiaoDien_HocVien.giaoDienChinh();
                break;
            }
        }
    }
    public static NguoiDung kiemtraDN(String username, String pass) {
        for (NguoiDung x : UserDB.docFile()) 
            if (x.dangNhap(username, pass)) 
                return x;
        return null;
    }
}
