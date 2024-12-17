package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.khoahoc.KhoaHoc;
import model.khoahoc.CapBac;

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
                CapBacDB capBacDB = new CapBacDB();
                CapBac cb = capBacDB.getCapBacById(tmp[1]);
                KhoaHoc x = new KhoaHoc(tmp[0],cb,tmp[2],tmp[3],Double.parseDouble(tmp[4]));
                listKhoaHoc.add(x);
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listKhoaHoc;
    }

    
    public KhoaHoc getKhoaHocById(String id) {
        for (KhoaHoc x : this.listKhoaHoc) 
            if (x.getMaKhoaHoc().equals(id))
                return x;
        return null;
    }

    public ArrayList<KhoaHoc> getListKhoaHocByIdCapBac(String id) {
        ArrayList<KhoaHoc> list = new ArrayList<>();
        for (KhoaHoc x : this.listKhoaHoc) 
            if (x.getcapBac().getMaCapBac().equals(id))
                list.add(x);
        return list;
    }

    public ArrayList<KhoaHoc> getListKhoaHocByIdChuongTrinh(String id) {
        ArrayList<KhoaHoc> list = new ArrayList<>();
        for (KhoaHoc x : this.listKhoaHoc) 
            if (x.getcapBac().getChuongTrinh().getMaChuongTrinh().equals(id))
                list.add(x);
        return list;
    }
    public static void main(String[] args) {
        KhoaHocDB KhoaHocDB = new KhoaHocDB(); 
        for (KhoaHoc x : KhoaHocDB.getlistKhoaHoc())
            x.show();
    }
}
