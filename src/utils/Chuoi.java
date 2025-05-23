package utils;

import model.person.NgayThangNam;

public class Chuoi {
    public static String formatSearch(String str) {
        if (str == null) return null; // Kiểm tra chuỗi null
        return str.trim().replaceAll("\\s+", " ");
    }

    public static String line(int sl,char ch) {
        StringBuilder sb = new StringBuilder(); 
        for (int i=0; i<sl; i++) 
            sb.append(ch);
        return sb.toString();
    }

    public static String centerText(String text, int width) {
        int x = (width-text.length())/2;
        return line(x,' ') + text;
    }

    public static boolean isTontai(String[] list, String key) {
        for (String  x : list) {
            if (key.indexOf(x) != -1) 
                return true;
        }
        return false;
    }
      
    

}
