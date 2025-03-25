class Solution {
   
    void pushZerosToEnd(int[] arr) {
         int[] num=new int[arr.length];
    int n=0;
    int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               num[n]=arr[i];
                n++; 
            }
            if(arr[i]==0){
                k++;
            }
        }
        for (int j=0;j<k;j++){
            num[n++]=0;
        }
       for(int i=0;i<num.length;i++){
           System.out.print(num[i]+" ");
       }
      System.out.println();
      
    }
}
