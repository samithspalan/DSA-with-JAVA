class Solution {
    public int reverse(int x) {
       int y;
       long z=0;
  
       while(x!=0){
        y=x%10;
        x=x/10;
        z=z*10+y;
       }
     if(z>Integer.MAX_VALUE||z<Integer.MIN_VALUE){
        return 0;
       }
       return (int)z;

    }
}
