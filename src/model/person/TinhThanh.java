package model.person;

import java.util.Scanner;

public class TinhThanh {
    private String matinh;
    private String tentinh;
    public static String[] arrTinh = getDulieuTinh();
    //thiết lập thông tin tổng thể
    public TinhThanh(){}

    public TinhThanh(String matinh, String tentinh) {
        this.matinh = matinh;
        this.tentinh = tentinh;
    }

    public TinhThanh(TinhThanh tinh){
        this.matinh = tinh.getMatinh(); 
        this.tentinh = tinh.getTentinh();
    }

    public static void main(String[] args) {
        TinhThanh hihi = new TinhThanh();
        hihi.setInfor();
    }
    //thiết lập thông tin từng thành phần 
    public void setInfor() {
        Scanner sc = new Scanner(System.in);
        printArrTinh();
        int n;
        while (true) {
            System.out.print("So thu tu tinh la: ");
            n = Integer.parseInt(sc.nextLine());
            if (n>0 && n<64) 
                break;
        }
        String[] strarr = arrTinh[n-1].split("-");
        this.matinh = strarr[0];
        this.tentinh = strarr[1];
    }

    public void setMatinh(String matinh) {
        this.matinh = matinh;
    }

    public void setTentinh(String tentinh) {
        this.tentinh = tentinh;
    }

    //lấy thông tin từng thành phần
    public String getMatinh() {
        return this.matinh;
    }

    public String getTentinh() {
        return this.tentinh;
    }

    //hiển thị và lấy thông tin đưa ra trên 1 dòng
    public void show() {
        System.out.printf(this.getInfor());
    }

    public String getInfor() {
        return this.matinh + "-" + this.tentinh;
    }

    public int compareTo(TinhThanh tinh) {
        return this.tentinh.compareTo(tinh.getTentinh());
    }
    public static String getMatinh(int n) {
        String[] stra = arrTinh[n].split("-");
        return stra[0];
    }
    public static TinhThanh layTinhTheoMaTinh(String maTinh) {
        for (String x : arrTinh) {
            String[] tmp = x.split("-");
            if (maTinh.compareTo(tmp[0]) == 0) 
                return new TinhThanh(tmp[0], tmp[1]);
        }
        return null;
    }
    //--------------------------------------------
    public static String[] getDulieuTinh() {
        return new String[]{
            "001-Ha Noi",
            "002-Ha Giang",
            "004-Cao Bang",
            "006-Bac Kan",
            "008-Tuyen Quang",
            "010-Lao Cai",
            "011-Dien Bien",
            "012-Lai Chau",
            "014-Son La",
            "015-Yen Bai",
            "017-Hoa Binh",
            "019-Thai Nguyen",
            "020-Lang Son",
            "022-Quang Ninh",
            "024-Bac Giang",
            "025-Phu Tho",
            "026-Vinh Phuc",
            "027-Bac Ninh",
            "030-Hai Duong",
            "031-Hai Phong",
            "033-Hung Yen",
            "034-Thai Binh",
            "035-Ha Nam",
            "036-Nam Dinh",
            "037-Ninh Binh",
            "038-Thanh Hoa",
            "040-Nghe An",
            "042-Ha Tinh",
            "044-Quang Binh",
            "045-Quang Tri",
            "046-Thua Thien Hue",
            "048-Da Nang",
            "049-Quang Nam",
            "051-Quang Ngai",
            "052-Binh Dinh",
            "054-Phu Yen",
            "056-Khanh Hoa",
            "058-Ninh Thuan",
            "060-Binh Thuan",
            "062-Kon Tum",
            "064-Gia Lai",
            "066-Dak Lak",
            "067-Dak Nong",
            "068-Lam Dong",
            "070-Binh Phuoc",
            "072-Tay Ninh",
            "074-Binh Duong",
            "075-Dong Nai",
            "077-Ba Ria Vung Tau",
            "079-Ho Chi Minh",
            "080-Long An",
            "082-Tien Giang",
            "083-Ben Tre",
            "084-Tra Vinh",
            "086-Vinh Long",
            "087-Dong Thap",
            "089-An Giang",
            "091-Kien Giang",
            "092-Can Tho",
            "093-Hau Giang",
            "094-Soc Trang",
            "095-Bac Lieu",
            "096-Ca Mau"
        };
    }

    //--------------------------------------------------------
    public static void printArrTinh() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        String[] a;
        for (int i=0; i<63; i++) {
            if (i%6 == 0 && i != 0) 
                System.out.println();
            a = arrTinh[i].split("-");
            System.out.printf("%2d-%-16s ",i+1,a[1]);
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }
}
