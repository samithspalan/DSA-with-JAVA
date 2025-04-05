

class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
       int i=0;
       int n=arr.length;
       for(i=0;i<n;i++){
           while(arr[i]>=1 && arr[i]<=n && arr[i]!=arr[arr[i]-1]){
               int temp=arr[i];
               int temp2=arr[i]-1;
               arr[i]=arr[temp2];
               arr[temp2]=temp;
           }
         
       }
         for(i=0;i<n;i++){
               if(arr[i]!=i+1){
                   return i+1;
               }
           }
       return n+1;
    }
}
