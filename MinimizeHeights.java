class Solution {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int res=arr[n-1]-arr[0];
       for(int i=1;i<n;i++){
           if(arr[i]-k<0){
               continue;
           }
           int minh=Math.min(arr[0]+k,arr[i]-k);
           int maxh=Math.max(arr[i-1]+k,arr[n-1]-k);
           res=Math.min(res,maxh-minh);
           
       }
       return res;
    }
}
