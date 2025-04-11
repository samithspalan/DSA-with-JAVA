
class Solution {
    public static int[] compute(String s){
        int n=s.length();
        int []lps=new int[n];
        int i=0;
        int j=1;
        while(j<n){
        if(s.charAt(j)==s.charAt(i)){
            i=i+1;
            lps[j]=i;
            j=j+1;
            
        }
        else{
            if(i!=0){
                i=lps[i-1];
            }
            else{
                lps[j]=0;
                j=j+1;            }
        }
    }
    return lps;
    }
    public static int minChar(String s) {
       int n=s.length();
       String reversed=new StringBuilder(s).reverse().toString();
       s=s+"$"+reversed;
       int []lps=compute(s);
       return n-lps[lps.length-1];
    }
}
