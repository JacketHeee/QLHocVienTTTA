package utils;
import java.util.Random;
import java.util.Scanner;
public class Generate {
    public static String numberString(int count) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++) 
            sb.append(rand.nextInt(10));
        return sb.toString();
    }
    public static String substring(String string, int n) {
        return string.substring(string.length()-n);
    }
    public static String IDPerson(String matinh, int gioitinh, String namsinh) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(matinh);
        int k=0;
        if (namsinh.compareTo("1899")>0 && namsinh.compareTo("2000")<0) k = 0;
        if (namsinh.compareTo("1999")>0 && namsinh.compareTo("2100")<0) k = 2;
        if (namsinh.compareTo("2099")>0 && namsinh.compareTo("2200")<0) k = 4; 
        if (namsinh.compareTo("2199")>0 && namsinh.compareTo("2300")<0) k = 6; 
        if (namsinh.compareTo("2299")>0 && namsinh.compareTo("2400")<0) k = 8;
        if (gioitinh == 0) k++;
        sb.append(k);
        sb.append(substring(namsinh, 2));
        sb.append(numberString(6));
        return sb.toString();
    }

    public static String numberString(int count, int number) {
        String numberstring = String.valueOf(number);
        StringBuilder sb = new StringBuilder("");
        int k = numberstring.length();
        while (k < count) {
            sb.append("0");
            k++;
        }
        sb.append(numberstring);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(numberString(5, 6));
    }
}
