class Solution {
    public static int sumOfDivisors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                    count+=j;
                    }
                
            }
        }
        return count;
    }
}
