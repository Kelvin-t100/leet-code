class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet <Character> ans=new LinkedHashSet<>();
         int high=0;
     for(int i=0;i<s.length();i++){
        char a=s.charAt(i);
        if(!ans.contains(a))
        ans.add(a);
        else{
            while(ans.contains(a)){
                ans.removeFirst();
            }
            ans.add(a);
        }
       if(high<ans.size()){
        high=ans.size();
       }
        
     }   
    // System.out.print(ans);
   return high;
    }
}