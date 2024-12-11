package model.person;
import utils.*;
import java.util.Scanner;

public class DiaChi {
    private String sonha,duong,phuong,quan;
    private TinhThanh tinh;

    // thiết lập thông tin tổng thể
    public static void main(String[] args) {
        DiaChi dc = new DiaChi();
        dc.setInfor();
        System.out.println(dc.getInfor());
    }
    public void setInfor() {
        Scanner sc = new Scanner(System.in);
        this.tinh.setInfor();
        System.out.printf("Tinh: %s\n",this.tinh.getTentinh());
        System.out.print("Quan: ");
        this.quan = NameHandler.format(sc.nextLine());
        System.out.print("Phuong: ");
        this.phuong =NameHandler.format(sc.nextLine());
        System.out.print("Duong: ");
        this.duong =NameHandler.format(sc.nextLine());
        System.out.print("So nha: ");
        this.sonha =NameHandler.format(sc.nextLine());
    }
    public DiaChi(
    ) {
        this.tinh = new TinhThanh();
    }
    public DiaChi(String sonha, String duong, String phuong, String quan, TinhThanh tinh) {
        this.sonha = sonha;
        this.duong = duong;
        this.phuong = phuong;
        this.quan = quan;
        this.tinh = tinh;
    }
    // public DiaChi(DiaChi diaChi) {
    //     this.sonha = diaChi.getSonha();
    //     this.duong = diaChi.getDuong();
    //     this.phuong = diaChi.getPhuong();
    //     this.quan = diaChi.getQuan();
    //     this.tinh = diaChi.getTinh();
    // }
    //thiết lập thông tin từng phần tử
    public void setSonha(String sonha) {
        this.sonha = sonha;
    }
    public void setDuong(String duong) {
        this.duong = duong;
    }
    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }
    public void setQuan(String quan) {
        this.quan = quan;
    }
    public void setTinh(TinhThanh tinh) {
        this.tinh = tinh;
    }
    //lấy thông tin từng phần tử
    public String getSonha() {  
        return sonha;
    }
    public String getDuong() {
        return duong;
    }
    public String getPhuong() {
        return phuong;
    }
    public String getQuan() {
        return quan;
    }
    public TinhThanh getTinh() {
        return tinh;
    }
    //lấy thông tin và hiển thị dưới dạng 1 hàng
    public String getInfor() {
        return String.format("%-3s, %-20s, Phuong %-10s, Quan %-9s, Tinh %s",sonha,duong,phuong,quan,tinh.getTentinh());
    }
    public void show() {
        System.out.printf(this.getInfor());
    } 
    public int compareTo(DiaChi address) {
        int k = this.tinh.compareTo(address.getTinh());
        if (k != 0) 
            return k;
        k = this.quan.compareTo(address.getQuan());
        if (k != 0) 
            return k;
        k = this.phuong.compareTo(address.getPhuong());
        if (k != 0) 
            return k;
        k = this.duong.compareTo(address.getDuong());
        if (k != 0) 
            return k;
        return this.sonha.compareTo(address.getSonha());
    }
    
}
