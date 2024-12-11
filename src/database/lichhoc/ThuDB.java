package database.lichhoc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.lichhoc.Thu;

public class ThuDB {
       private ArrayList<Thu> listThu; 
    static String src;

    public ThuDB() {
        src = "data/lichhoc/Thu_data.txt";
        listThu = this.docFile();
    }

    public ArrayList<Thu> getlistThu() {
        return listThu;
    }

    public void setlistThu(ArrayList<Thu> listThu) {
        this.listThu = listThu;
    }
    public ArrayList<Thu> docFile() {
        ArrayList<Thu> listThu = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                listThu.add(new Thu(tmp[0],tmp[1]));
            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listThu;
    }

    public static void main(String[] args) {
        ThuDB ThuDB = new ThuDB(); 
        for (Thu x : ThuDB.getlistThu())
            x.show();
    }
}
