package utils;
import java.lang.String;
public class NameHandler {
    private static char upcase(char ch) {
        if (ch>='a' && ch<='z') 
            ch = (char)(ch - 32);
        return ch;
    }
    public static String format(String stringName) {
        String[] stra = stringName.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<stra.length; i++) 
            if (stra[i] != "")
                sb.append(stra[i]+" ");
        sb.setLength(sb.length()-1); 
        int length = sb.length();
        if (length != 0) 
            sb.replace(0,1,String.valueOf(upcase(sb.charAt(0))));
        int k = sb.indexOf(" ");
        while (k != -1) {
            sb.replace(k+1,k+2,String.valueOf(upcase(sb.charAt(k+1))));
            k = sb.indexOf(" ",k+1);        }

        return sb.toString();
    }
    public static String getName(String fullname) {
        return fullname.substring(fullname.lastIndexOf(" ")+1);
    }
    public static String getAllbeforeName(String fullname) {
        return fullname.substring(0, fullname.length()-getName(fullname).length());
    }
    public static void main(String[] args) {
        System.out.println(getAllbeforeName("NguyenMang")+"hihi"+getName("Nguyen Hung Manh"));
    }
}
