class Solution {
    public int getSecondLargest(int[] arr) {
       int num=arr.length;
       if(num<2){
           return -1;
       }
       int first;
       int sec=0;
       first=arr[0];
       for(int i=1;i<num;i++){
           if(arr[i]>first){
               sec=first;
               first=arr[i];
           }
           else if(arr[i]!=first && arr[i]>sec){
               sec=arr[i];
           }
       }
       if(sec==0){
           return -1;
       }
       else
       {
           return sec;
       }
    }
}
