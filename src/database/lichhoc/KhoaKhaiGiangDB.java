package database.lichhoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.lichhoc.KhoaKhaiGiang;
import model.person.NgayThangNam;
public class KhoaKhaiGiangDB {
    private ArrayList<KhoaKhaiGiang> listKhoaKhaiGiang; 
    static String src;
    
    public KhoaKhaiGiangDB() {
        src = "data/lichhoc/KhoaKhaiGiang_data.txt";
        listKhoaKhaiGiang = this.docFile();
    }

    public static void main(String[] args) {
        KhoaKhaiGiangDB KhoaKhaiGiangDB = new KhoaKhaiGiangDB(); 
        for (KhoaKhaiGiang x : KhoaKhaiGiangDB.getlistKhoaKhaiGiang())
            x.show();
    }
    
    public ArrayList<KhoaKhaiGiang> getlistKhoaKhaiGiang() {
        return listKhoaKhaiGiang;
    }

    public void setlistKhoaKhaiGiang(ArrayList<KhoaKhaiGiang> listKhoaKhaiGiang) {
        this.listKhoaKhaiGiang = listKhoaKhaiGiang;
    }
    public ArrayList<KhoaKhaiGiang> docFile() {
        ArrayList<KhoaKhaiGiang> listKhoaKhaiGiang = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                NgayThangNam nbd = new NgayThangNam(tmp[3], tmp[4], tmp[5]);
                NgayThangNam nkt = new NgayThangNam(tmp[6], tmp[7], tmp[8]);
                int namHoc = Integer.parseInt(tmp[2]);
                listKhoaKhaiGiang.add(new KhoaKhaiGiang(tmp[0],tmp[1],namHoc,nbd,nkt,tmp[9]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listKhoaKhaiGiang;
    }

    
    public KhoaKhaiGiang getKhoaKhaiGiangById(String id) {
        for (KhoaKhaiGiang x : this.listKhoaKhaiGiang) 
            if (x.getMaKhoaKhaiGiang().equals(id))
                return x;
        return null;
    }
}
