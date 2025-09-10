import java.util.*;
public class Stringreverse {
    public static void main(String[] args) {
        String a="I love U";
        String[] c=a.split(" ");
        System.out.println(Arrays.toString(c));
        StringBuilder res=new StringBuilder();
        int end=a.length();
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)==' '){
                res.append(a.substring(i + 1, end)).append(" ");
                end=i;
            }
        }
        if(end!=0){
            res.append(a.substring(0, end));
        }
        System.out.println(res);


    }
}
