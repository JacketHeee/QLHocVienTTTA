package database.lichhoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.lichhoc.*;

public class CaHocDB {
       private ArrayList<CaHoc> listCaHoc; 
    static String src;

    public CaHocDB() {
        src = "data/lichhoc/CaHoc_data.txt";
        listCaHoc = this.docFile();
    }

    public ArrayList<CaHoc> getlistCaHoc() {
        return listCaHoc;
    }

    public void setlistCaHoc(ArrayList<CaHoc> listCaHoc) {
        this.listCaHoc = listCaHoc;
    }
    public ArrayList<CaHoc> docFile() {
        ArrayList<CaHoc> listCaHoc = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                listCaHoc.add(new CaHoc(tmp[0],new GioPhut(Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2])),
                    new GioPhut(Integer.parseInt(tmp[3]),Integer.parseInt(tmp[4]))));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listCaHoc;
    }

    public static void main(String[] args) {
        CaHocDB CaHocDB = new CaHocDB(); 
        for (CaHoc x : CaHocDB.getlistCaHoc())
            x.show();
    }

    public CaHoc getCaHocById(String id) {
        for (CaHoc x : this.listCaHoc) 
            if (x.getMaCaHoc().equals(id))
                return x;
        return null;
    }
}

