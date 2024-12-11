package database.chinhanh_phonghoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.chinhanh_phonghoc.ChiNhanh;
import model.person.DiaChi;
import model.person.NgayThangNam;
import model.person.TinhThanh;
import model.chinhanh_phonghoc.*;

public class ChiNhanhDB {
    private ArrayList<ChiNhanh> listChiNhanh; 
    static String src;

    public ChiNhanhDB() {
        src = "data/chinhanh_phonghoc/ChiNhanh_data.txt";
        listChiNhanh = this.docFile();
    }

    public ArrayList<ChiNhanh> getlistChiNhanh() {
        return listChiNhanh;
    }

    public void setlistChiNhanh(ArrayList<ChiNhanh> listChiNhanh) {
        this.listChiNhanh = listChiNhanh;
    }
    public ArrayList<ChiNhanh> docFile() {
        ArrayList<ChiNhanh> listChiNhanh = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                DiaChi diaChi = new DiaChi(tmp[2],tmp[3],tmp[4],tmp[5],TinhThanh.layTinhTheoMaTinh(tmp[6]));
                listChiNhanh.add(new ChiNhanh(tmp[0],tmp[1],diaChi,tmp[7]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listChiNhanh;
    }
    public static void main(String[] args) {
        ChiNhanhDB chiNhanhDB = new ChiNhanhDB(); 
        for (ChiNhanh x : chiNhanhDB.getlistChiNhanh()) 
            x.show();
    }
}
