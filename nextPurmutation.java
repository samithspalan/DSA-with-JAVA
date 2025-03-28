
class Solution {
    void nextPermutation(int[] arr) {
      int n=arr.length;
      int pivot=-1;
      for(int i=n-1;i>0;i--){
          if(arr[i-1]<arr[i]){
              pivot=i-1;
              break;
          }
      }
        if(pivot==-1){
             int left=0;
             int right=n-1;
          while(left<right){
                  int temp=arr[left];
                  arr[left]=arr[right];
                  arr[right]=temp;
                  left++;
                  right--;
              }
              return;
      }
         for(int i=n-1;i>pivot;i--){ 
             if(arr[i]>arr[pivot]){
               int temp1=arr[pivot];
              arr[pivot]=arr[i];
              arr[i]=temp1;  
              break;
             }
      }
          
              int left1=pivot+1;
              int right1=n-1;
              while(left1<right1){
                  int temp=arr[left1];
                  arr[left1]=arr[right1];
                  arr[right1]=temp;
                  left1++;
                  right1--;
              }
       
      
      
    } 
      }
