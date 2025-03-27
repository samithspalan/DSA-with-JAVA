class Solution {
     static void reverse(int arr[],int a,int b){
       while(a<b){
           int temp=arr[a];
           arr[a]=arr[b];
           arr[b]=temp;
           a++;
           b--;
       }
     }
    static void rotateArr(int arr[], int d) {
     int n=arr.length;
     d=d%n;
     reverse(arr,0,d-1);
     reverse(arr,d,n-1);
     reverse(arr,0,n-1);
    }
}
