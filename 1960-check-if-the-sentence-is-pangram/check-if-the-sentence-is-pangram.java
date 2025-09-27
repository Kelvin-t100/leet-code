class Solution {
    public boolean checkIfPangram(String s) {
     HashSet<Character> ch=new HashSet<>();
     for(int i=0;i<s.length();i++){
      ch.add(s.charAt(i));
     }  
     if(ch.size()==26)
     return true;
     else 
     return false;
    }
}