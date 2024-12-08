package database;
import java.io.*;
import java.util.Scanner;
import model.NguoiDung;
import model.person.NgayThangNam;
import interfaces.*;
import java.util.ArrayList;
public class UserDB {
    static String src = "data/Users_data.txt";
    public static void main(String[] args) {
        // System.err.println(System.getProperty("user.dir"));
        UserDB hii = new UserDB();
        hii.docFile();
    }
    public static ArrayList<NguoiDung> docFile() {
        ArrayList<NguoiDung> listUser = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                NgayThangNam ngaydk = new NgayThangNam(tmp[7],tmp[8],tmp[9]);
                // System.out.println(ngaydk.getInfor());

                int role = Integer.parseInt(tmp[3]);
                listUser.add(new NguoiDung( tmp[0], tmp[1],tmp[2],role,tmp[4], tmp[5], tmp[6],ngaydk));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listUser;
    }
    public static void ghiVaofile(NguoiDung user) {
        try (FileWriter writer = new FileWriter(src, true)) { // 'true' để mở chế độ ghi thêm

            System.out.println("Ghi thêm dữ liệu vào file thành công!");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
