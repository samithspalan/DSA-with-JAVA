import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        String name="samithsz";
        int[] arr=new int[26];
        for(int i=0;i<name.length();i++){
            int c=name.charAt(i);
            int d=c-97;
            arr[d]++;

        }
     for(int i=0;i<arr.length;i++){
         if(arr[i]>1){
             char e= (char) (i+97);
             System.out.println(e);
         }
     }
    }
}
