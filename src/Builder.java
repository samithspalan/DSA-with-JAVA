import java.util.*;
public class Builder {
    public static void main(String[] args) {
        String a="aaabbcc";
        StringBuilder builder=new StringBuilder();
        int c=1;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)==a.charAt(i-1)){
                c++;
            }
            else{
                builder.append(a.charAt(i-1)).append(c);
                c=1;
            }
        }
        builder.append(a.charAt(a.length()-1)).append(c);
        System.out.println(builder);
    }
}
