class Solution {
    public int countTriplets(int[] arr, int target) {
         int n=arr.length;
         int res=0;
         int cnt1=0;
         int cnt2=0;
         int ele1=0;
         int ele2=0;
         int l,r,i,sum;
         for(i=0;i<n-2;i++){
             l=i+1;
             r=n-1;
             while(l<=r){
                 sum=arr[l]+arr[i]+arr[r];
                 if(sum<target){
                     l++;
                     
                 }
                 else if(sum>target){
                     r--;
                 }
                 else{
                 ele1=arr[l];
                 ele2=arr[r];
                 cnt1=0;
                 cnt2=0;
                 while(l<=r && arr[l]==ele1){
                     cnt1+=1;
                     l+=1;
                 }
                 while(l<=r && arr[r]==ele2){
                     cnt2+=1;
                     r-=1;
                 }
                 if(ele1==ele2){
                     res+=(cnt1*(cnt1-1))/2;
                 }
                 else{
                     res+=(cnt1*cnt2);
                 }
             }
             }
         }
         
      return res;  
    }
}
