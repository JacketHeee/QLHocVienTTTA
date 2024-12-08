package auth;
import java.time.LocalDate;
import java.util.Scanner;
import database.*;
import model.NguoiDung;
import model.person.NgayThangNam;
public class DangKyController {
    public static void UIDangKy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten tai khoan: ");
        String username = sc.nextLine(); 
        System.out.print("Mat khau: ");
        String pass = sc.nextLine(); 
        System.out.print("Nhap lai mat khau");
        String repass = sc.nextLine(); 
        System.out.print("So dien thoai: ");
        String sdt = sc.nextLine(); 
        System.out.print("Email: ");
        String email = sc.nextLine(); 
        LocalDate curDate = LocalDate.now();
        NgayThangNam ngaydk = new NgayThangNam(curDate.getDayOfMonth()+"", curDate.getMonthValue()+"", curDate.getYear()+"");
        UserDB.ghiVaofile(new NguoiDung(UserDB.docFile().size()+"",username,pass,3,"Hoat dong",sdt,email,ngaydk));
    }
}

