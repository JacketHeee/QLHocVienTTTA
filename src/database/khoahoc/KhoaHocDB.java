package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.khoahoc.KhoaHoc;
import model.khoahoc.CapBac;
import model.khoahoc.ChuongTrinh;
import services.CapBacServices;
import services.ChuongTrinhServices;

public class KhoaHocDB {
       private ArrayList<KhoaHoc> listKhoaHoc; 
    static String src;

    public KhoaHocDB() {
        src = "data/khoahoc/KhoaHoc_data.txt";
        listKhoaHoc = this.docFile();
    }

    public ArrayList<KhoaHoc> getlistKhoaHoc() {
        return listKhoaHoc;
    }

    public void setlistKhoaHoc(ArrayList<KhoaHoc> listKhoaHoc) {
        this.listKhoaHoc = listKhoaHoc;
    }
    public ArrayList<KhoaHoc> docFile() {
        ArrayList<KhoaHoc> listKhoaHoc = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                CapBacServices capBacServices = new CapBacServices();
                CapBac cb = capBacServices.getCapBacById(tmp[1]);
                listKhoaHoc.add(new KhoaHoc(tmp[0],cb,tmp[2],tmp[3],Double.parseDouble(tmp[4])));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listKhoaHoc;
    }

    public static void main(String[] args) {
        KhoaHocDB KhoaHocDB = new KhoaHocDB(); 
        for (KhoaHoc x : KhoaHocDB.getlistKhoaHoc())
            x.show();
    }
}
