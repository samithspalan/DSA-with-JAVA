
class Solution {
    static char nonRepeatingChar(String s) {
      int [] vis=new int[26];
      int id;
      int min=s.length();
      for(int i=0;i<26;i++){
          vis[i]=-1;
      }
      for(int i=0;i<s.length();i++){
          id=(int)(s.charAt(i)-'a');
          if(vis[id]==-1){
              vis[id]=i;
          }
          else{
              vis[id]=-2;
          }
      } 
      for(int i=0;i<26;i++){
          if(vis[i]>=0){
            min=Math.min(min,vis[i]);
          }
      }
     if(min!=s.length()){
         return s.charAt(min);
     }
     return '$';   
    }
}
