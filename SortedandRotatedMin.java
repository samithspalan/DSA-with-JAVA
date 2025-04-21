class Solution {
    public int findMin(int[] arr) {
      int n=arr.length;
      int low=0;
      int high=n-1;
      int mid;
      while(low<high){
          if(arr[low]<arr[high]){
              return arr[low];
          }
          mid=(low+high)/2;
          if(arr[mid]>arr[high]){
              low=mid+1;
          }
          else{
              high=mid;
          }
      }
      return arr[high];
    }
}
