  class Solution {
        public int kthElement(int a[], int b[], int k) {
            if(a.length>b.length)return  kthElement(b,a,k);
            int m=a.length;
            int n=b.length;
            int low=Math.max(0,k-n),high=Math.min(k,m);
            while(low<=high){
               int cuta=(low+high)/2;
               int cutb=k-cuta;
               int l1=(cuta==0)?Integer.MIN_VALUE:a[cuta-1];
               int l2=(cutb==0)?Integer.MIN_VALUE:b[cutb-1];
               int r1=(cuta==m)?Integer.MAX_VALUE:a[cuta];
               int r2=(cutb==n)?Integer.MAX_VALUE:b[cutb];
               if(l1<=r2 && l2<=r1){
                   return Math.max(l1,l2);
               }
               else if(l1>r2){
                   high=cuta-1;
               }else{
                   low=cuta+1;
               }
               }
                
                
            
            return -1;
        }
    }
