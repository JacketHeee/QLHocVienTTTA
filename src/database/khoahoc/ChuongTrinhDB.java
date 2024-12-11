package database.khoahoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.khoahoc.*;

public class ChuongTrinhDB {
       private ArrayList<ChuongTrinh> listChuongTrinh; 
    static String src;

    public ChuongTrinhDB() {
        src = "data/khoahoc/ChuongTrinh_data.txt";
        listChuongTrinh = this.docFile();
    }

    public ArrayList<ChuongTrinh> getlistChuongTrinh() {
        return listChuongTrinh;
    }

    public void setlistChuongTrinh(ArrayList<ChuongTrinh> listChuongTrinh) {
        this.listChuongTrinh = listChuongTrinh;
    }
    public ArrayList<ChuongTrinh> docFile() {
        ArrayList<ChuongTrinh> listChuongTrinh = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                listChuongTrinh.add(new ChuongTrinh(tmp[0],tmp[1],tmp[2]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listChuongTrinh;
    }

    public static void main(String[] args) {
        ChuongTrinhDB ChuongTrinhDB = new ChuongTrinhDB(); 
        for (ChuongTrinh x : ChuongTrinhDB.getlistChuongTrinh())
            x.show();
    }
}
