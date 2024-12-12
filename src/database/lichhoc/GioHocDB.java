package database.lichhoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.lichhoc.*;

public class GioHocDB {
       private ArrayList<GioHoc> listGioHoc; 
    static String src;

    public GioHocDB() {
        src = "data/lichhoc/GioHoc_data.txt";
        listGioHoc = this.docFile();
    }

    public ArrayList<GioHoc> getlistGioHoc() {
        return listGioHoc;
    }

    public void setlistGioHoc(ArrayList<GioHoc> listGioHoc) {
        this.listGioHoc = listGioHoc;
    }
    public ArrayList<GioHoc> docFile() {
        ArrayList<GioHoc> listGioHoc = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                CaHocDB caHocDB = new CaHocDB();
                ThuDB thuDB =  new ThuDB();
                CaHoc caHoc =  caHocDB.getCaHocById(tmp[1]); 
                Thu thu1 = thuDB.getThuById(tmp[2]); 
                Thu thu2 = thuDB.getThuById(tmp[3]); 
                listGioHoc.add(new GioHoc(tmp[0],caHoc,thu1,thu2,tmp[4]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listGioHoc;
    }

    public static void main(String[] args) {
        GioHocDB GioHocDB = new GioHocDB(); 
        for (GioHoc x : GioHocDB.getlistGioHoc())
            x.show();
    }


    public GioHoc getGioHocById(String id) {
        for (GioHoc x : this.listGioHoc) 
            if (x.getMaTKB().equals(id))
                return x;
        return null;
    }
}
