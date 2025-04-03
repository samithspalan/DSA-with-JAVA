class Solution {
   
    int maxProduct(int[] arr) {
        int curmax=arr[0];
        int curmin=arr[0];
        int maxval=arr[0];
        int res=arr[0];
      for(int i=1;i<arr.length;i++){
           int temp=Math.max(arr[i],Math.max(curmin*arr[i],curmax*arr[i]));
          curmin=Math.min(arr[i],Math.min(curmin*arr[i],curmax*arr[i]));
         curmax=temp;
          
          res=Math.max(curmax,res);
      }return res;
    }
}
