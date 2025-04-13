class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
       int n=arr.length;
       int high=n-1;
       int low=0;
       int mid=0;
       while(mid<=high){
           if(arr[mid]==0){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               mid+=1;
               low+=1;
           }
           else if(arr[mid]==2){
               int temp=arr[high];
               arr[high]=arr[mid];
               arr[mid]=temp;
                high-=1;
           }
           else{
               mid+=1;
           }
       }
    }
}
