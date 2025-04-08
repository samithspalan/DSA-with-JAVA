class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        int i;
        Map<Character,Integer> CC=new HashMap<>();
        for(i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            CC.put(ch,CC.getOrDefault(ch,0)+1)  ;
        }
        for(i=0;i<s2.length();i++){
             char ch=s2.charAt(i);
            CC.put(ch,CC.getOrDefault(ch,0)-1)  ;
        }
        
        for(int ch:CC.values()){
            if(ch!=0){
                return false;
            }
        }
     return true;
     
    }
}
