import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String a ="mallu";
        String b="malul";
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String e=new String(c);
        String f=new String(d);
        if(e.equals(f)){
            System.out.println("Anagram");
        }
        System.out.println("Not a Anagram");

    }
}
