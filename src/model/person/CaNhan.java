package model.person;
import utils.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utils.NameHandler;

public class CaNhan {
    private String hoten;
    private NgayThangNam ngaysinh;
    private DiaChi noisinh;
    private int gioitinh;//1. Nam, 0. Nu
    //----------------------------
    public static void main(String[] args) {
        // String infor = "237483#Nguyen Hung#Manh#01#01#2005#32#Cao Lo#4#8#034#1";
        // String[] arr = infor.split("#");
        // CaNhan nguoi = null; 
        // if (arr.length == 12) {
        //     NgayThangNam ngaysinh = new NgayThangNam(arr[3],arr[4],arr[5]);
        //     TinhThanh tinh = TinhThanh.layTinhTheoMaTinh(arr[10]);
        //     System.out.println(tinh);
        //     DiaChi diachi = new DiaChi(arr[6],arr[7],arr[8],arr[9],tinh);
        //     int gioitinh = Integer.parseInt(arr[11]);
        //     nguoi = new CaNhan(arr[0],arr[1]+" "+arr[2],ngaysinh,diachi,gioitinh);
        // }
        // nguoi.show();
    }
    public CaNhan() {
        this.ngaysinh = new NgayThangNam();
        this.noisinh = new DiaChi();
    }
    public CaNhan(String hoten, NgayThangNam ngaysinh, DiaChi noisinh, int gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.noisinh = noisinh;
        this.gioitinh = gioitinh;
    }
    public void setInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        this.hoten = NameHandler.format(sc.nextLine());
        System.out.print("Ngay sinh: ");
        this.ngaysinh.setInfor();
        System.out.print("1-Nam | 0- Nu\nGioi tinh:  ");
        this.gioitinh = Integer.parseInt(sc.nextLine());
        noisinh.setInfor();
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public NgayThangNam getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(NgayThangNam ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public DiaChi getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(DiaChi noisinh) {
        this.noisinh = noisinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getInfor() {
        return hoten+ ";" +ngaysinh.getInfor()+ ";" +gioitinh+ ";" + noisinh.getInfor(); 
    }

    public String getName() {
        return NameHandler.getName(this.hoten);
    }

    public String getAllBeforeName() {
        return NameHandler.getAllbeforeName(this.hoten);
    }

    public void show() {
        // System.out.printf("%-15s%6s | %10s | %-3d | %s\n",getAllBeforeName(),getName(),ngaysinh.getInfor(),gioitinh,noisinh.getInfor());
        System.out.printf("Ho ten: \033[1m%s\033[0m\n",hoten);
        System.out.printf("Ngay sinh: \033[1m%s\033[0m\n",ngaysinh.getInfor());
        System.out.printf("Gioi tinh: \033[1m%s\033[0m\n",gioitinh == 1 ? "Nam" : "Nu");
        System.out.printf("Dia chi: \033[1m%s\033[0m\n",noisinh.toString());
    }

    public  static String lum(String str, String replace) {
        Pattern pat = Pattern.compile("(\\d{3}-\\w+ \\w+ (\\w+)?)"); 
        Matcher mat = pat.matcher(str);
        return mat.replaceAll(replace);
    }     
}
