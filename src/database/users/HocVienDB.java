package database.users;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import model.person.DiaChi;
import model.person.NgayThangNam;
import model.person.TinhThanh;
import model.user.HocVien;
import model.user.NguoiDung;
import services.UserServices;

public class HocVienDB {
    private ArrayList<HocVien> listHocVien; 
    static String src;
    public static void main(String[] args) {
        HocVienDB hocVienDB = new HocVienDB(); 
        for (HocVien x: hocVienDB.getListHocVien()) 
            x.show();
    }
    public HocVienDB() {
        src = "data/users/HocViens_data.txt";
        listHocVien = this.docFile();
    }

    public ArrayList<HocVien> getListHocVien() {
        return listHocVien;
    }
    public void setListHocVien(ArrayList<HocVien> listHocVien) {
        this.listHocVien = listHocVien;
    }
    public ArrayList<HocVien> docFile() {
        ArrayList<HocVien> listHocVien = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String[] user = sc.nextLine().split("#"); 
                UserServices userServices = new UserServices();
                NguoiDung us = userServices.getUserByID(user[1]); 
                NgayThangNam ns = new NgayThangNam(user[3],user[4],user[5]);
                DiaChi noisinh = new DiaChi(user[6],user[7],user[8],user[9],TinhThanh.layTinhTheoMaTinh(user[10]));
                listHocVien.add(new HocVien(user[0],us,user[2],ns,noisinh,Integer.parseInt(user[11])));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listHocVien;
    }

    public void ghiFile(HocVien hocVien) {
        // try (FileWriter fw = new FileWriter(src, true)) 
        try (FileWriter fw = new FileWriter(src,true)) { // true để ghi tiếp vào file hiện có
            fw.write(System.lineSeparator());
            fw.write(
                hocVien.getMaHocVien() + "#" +
                hocVien.getMaNguoiDung().getMaNguoiDung() + "#" +
                hocVien.getHoten() + "#" +
                hocVien.getNgaysinh().getNgay() + "#" +
                hocVien.getNgaysinh().getThang() + "#" +
                hocVien.getNgaysinh().getNam() + "#" +
                hocVien.getNoisinh().getSonha() + "#" +
                hocVien.getNoisinh().getDuong() + "#" +
                hocVien.getNoisinh().getPhuong() + "#" +
                hocVien.getNoisinh().getQuan() + "#" +
                hocVien.getNoisinh().getTinh().getMatinh()+ "#" +
                hocVien.getGioitinh()
            );
            System.out.println(listHocVien.size());
            this.listHocVien.add(hocVien);
            System.out.println(listHocVien.size());
        } catch (IOException e) {
            System.out.println("Không thể ghi file");
        }
    }
    

    public HocVien getHocvienByID(String id) {
        for (HocVien x : this.listHocVien) 
            if (x.getMaHocVien().equals(id))
                return x;
        return null;
    }
    public HocVien getHocVienByIDUser(String id) {
        for (HocVien x : this.listHocVien) 
            if (x.getMaNguoiDung().getMaNguoiDung().equals(id))
                return x;
        return null;
    }

    public void capNhatHocVien(HocVien hocVien) {
        boolean isUpdated = false;
    
        for (int i = 0; i < listHocVien.size(); i++) {
            HocVien currentHocVien = listHocVien.get(i);
            if (currentHocVien.getMaHocVien().equals(hocVien.getMaHocVien())) {
                listHocVien.set(i, hocVien);
                isUpdated = true;
                break;
            }
        }
    
        if (isUpdated) {
            ghiFile(listHocVien);  // Ghi đè dữ liệu mới vào file
            System.out.println("Cập nhật thông tin học viên thành công.");
        } else {
            System.out.println("Không tìm thấy học viên để cập nhật.");
        }
    }
    

    public void ghiFile(ArrayList<HocVien> listHocViens) {
        try (FileWriter fw = new FileWriter(src)) { // Ghi đè dữ liệu vào file gốc
            for (int i=0; i<listHocViens.size()-1; i++) {
                fw.write(
                    listHocViens.get(i).getMaHocVien() + "#" +
                    listHocViens.get(i).getMaNguoiDung().getMaNguoiDung() + "#" +
                    listHocViens.get(i).getHoten() + "#" +
                    listHocViens.get(i).getNgaysinh().getNgay() + "#" +
                    listHocViens.get(i).getNgaysinh().getThang() + "#" +
                    listHocViens.get(i).getNgaysinh().getNam() + "#" +
                    listHocViens.get(i).getNoisinh().getSonha() + "#" +
                    listHocViens.get(i).getNoisinh().getDuong() + "#" +
                    listHocViens.get(i).getNoisinh().getPhuong() + "#" +
                    listHocViens.get(i).getNoisinh().getQuan() + "#" +
                    listHocViens.get(i).getNoisinh().getTinh().getMatinh() + "#" +
                    listHocViens.get(i).getGioitinh()
                );
                fw.write(System.lineSeparator());
            }
            int lis = listHocViens.size()-1;
            fw.write(
                    listHocViens.get(lis).getMaHocVien() + "#" +
                    listHocViens.get(lis).getMaNguoiDung().getMaNguoiDung() + "#" +
                    listHocViens.get(lis).getHoten() + "#" +
                    listHocViens.get(lis).getNgaysinh().getNgay() + "#" +
                    listHocViens.get(lis).getNgaysinh().getThang() + "#" +
                    listHocViens.get(lis).getNgaysinh().getNam() + "#" +
                    listHocViens.get(lis).getNoisinh().getSonha() + "#" +
                    listHocViens.get(lis).getNoisinh().getDuong() + "#" +
                    listHocViens.get(lis).getNoisinh().getPhuong() + "#" +
                    listHocViens.get(lis).getNoisinh().getQuan() + "#" +
                    listHocViens.get(lis).getNoisinh().getTinh().getMatinh() + "#" +
                    listHocViens.get(lis).getGioitinh()
                );
        } catch (IOException e) {
            System.out.println("Không thể ghi file");
        }
    }
    
}