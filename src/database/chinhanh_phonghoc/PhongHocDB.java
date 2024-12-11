package database.chinhanh_phonghoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.chinhanh_phonghoc.ChiNhanh;
import model.chinhanh_phonghoc.PhongHoc;
import model.person.DiaChi;
import model.person.TinhThanh;
import services.ChiNhanhServices;

public class PhongHocDB {
    private ArrayList<PhongHoc> listPhongHoc; 
    static String src;

    public PhongHocDB() {
        src = "data/chinhanh_phonghoc/PhongHoc_data.txt";
        listPhongHoc = this.docFile();
    }

    public ArrayList<PhongHoc> getlistPhongHoc() {
        return listPhongHoc;
    }

    public void setlistPhongHoc(ArrayList<PhongHoc> listPhongHoc) {
        this.listPhongHoc = listPhongHoc;
    }
    public ArrayList<PhongHoc> docFile() {
        ArrayList<PhongHoc> listPhongHoc = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                ChiNhanhServices chiNhanhServices = new ChiNhanhServices();
                ChiNhanh chiNhanh = chiNhanhServices.getChiNhanhById(tmp[2]);
                listPhongHoc.add(new PhongHoc(tmp[0],tmp[1],chiNhanh,Integer.parseInt(tmp[3]),tmp[4],tmp[5]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listPhongHoc;
    }

    public static void main(String[] args) {
        PhongHocDB phongHocDB = new PhongHocDB(); 
        for (PhongHoc x : phongHocDB.getlistPhongHoc())
            x.show();
    }
}
