
class Solution {
    public int maximumProfit(int prices[]) {
       int res=0;
       int minsofar=prices[0];
       for(int i=0;i<prices.length;i++){
           minsofar=Math.min(minsofar,prices[i]);
           res=Math.max(res,prices[i]-minsofar);
       }
       return res;
    }
}
