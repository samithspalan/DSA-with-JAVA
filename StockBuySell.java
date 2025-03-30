//localmax-localmin
class Solution {
    public int maximumProfit(int prices[]) {
        int res=0;
        int n=prices.length;
        int i=0;
        int lmin=prices[0];
        int lmax=prices[0];
        while(i<n-1){
     while(i<n-1 && prices[i]>=prices[i+1]){
         i++;
       
     }  lmin=prices[i];
      while(i<n-1 && prices[i]<=prices[i+1]){
         i++;
     }  lmax=prices[i];
         res+=lmax-lmin;
    }
       return res;
    }
}

//Accumulate profit
class Solution {
    public int maximumProfit(int prices[]) {
        int res=0;
       for(int i=1;i<prices.length;i++){
           if(prices[i]>prices[i-1]){
               res+=prices[i]-prices[i-1];
           }
       }
       return res;
    }
}
