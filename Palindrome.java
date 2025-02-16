class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y;
        int original=x;
        while(x>0){
            y=x%10;
            x=x/10;
            rev=rev*10+y;

        }
        if(rev==original){
            return true;
        }
        else{
           return false;
        }
    }
}
