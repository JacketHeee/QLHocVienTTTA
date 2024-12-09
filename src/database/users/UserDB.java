package database.users;
import java.io.*;
import java.util.Scanner;
import model.person.NgayThangNam;
import model.user.NguoiDung;
import java.util.ArrayList;

public class UserDB {
    static String src = "data/users/Users_data.txt";
    public static void main(String[] args) {
        // System.err.println(System.getProperty("user.dir"));
        // UserDB hii = new UserDB();
        // hii.docFile();
        
        ghiVaofile(docFile().get(1));
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
            writer.write("\n");
            writer.write(user.getMaNguoiDung()+"#");
            writer.write(user.getTenNguoiDung()+"#");
            writer.write(user.getMatKhau()+"#");
            writer.write(user.getrole()+"#");
            writer.write(user.getTrangThai()+"#");
            writer.write(user.getSoDienthoai()+"#");
            writer.write(user.getEmail()+"#");
            writer.write(user.getNgayDangKy().getForWrite());
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
