public class Duplicate {
    public static void main(String[] args) {
      String name="aaabbcc";
      int count=0;
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            char d=name.charAt(i+1);
            if(c==d){
                count++;

            }
        }
    }
}
