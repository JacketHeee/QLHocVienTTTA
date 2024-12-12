package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.khoahoc.CapBac;
import model.khoahoc.ChuongTrinh;

public class CapBacDB {
       private ArrayList<CapBac> listCapBac; 
    static String src;

    public CapBacDB() {
        src = "data/khoahoc/CapBac_data.txt";
        listCapBac = this.docFile();
    }

    public ArrayList<CapBac> getlistCapBac() {
        return listCapBac;
    }

    public void setlistCapBac(ArrayList<CapBac> listCapBac) {
        this.listCapBac = listCapBac;
    }
    public ArrayList<CapBac> docFile() {
        ArrayList<CapBac> listCapBac = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                ChuongTrinhDB chuongTrinhDB = new ChuongTrinhDB();
                ChuongTrinh ct = chuongTrinhDB.getChuongTrinhById(tmp[1]);
                listCapBac.add(new CapBac(tmp[0],ct,tmp[2],Integer.parseInt(tmp[3])));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listCapBac;
    }

    public static void main(String[] args) {
        CapBacDB CapBacDB = new CapBacDB(); 
        for (CapBac x : CapBacDB.getlistCapBac())
            x.show();
    }

    public CapBac getCapBacById(String id) {
        for (CapBac x : this.listCapBac) 
            if (x.getMaCapBac().equals(id))
                return x;
        return null;
    }
}
