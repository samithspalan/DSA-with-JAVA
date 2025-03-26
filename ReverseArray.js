class Solution {
    public void reverseArray(int arr[]) {
       int j=arr.length;
       for(int i=0;i<j;i++){
           j--;
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
    }
}
