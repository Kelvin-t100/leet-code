class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int l=Integer.MAX_VALUE;
        for(String s:strs){
           if(s.length()<l) l=s.length();
        }
        String s="";int check=1;
        for(int i=0;i<l;i++){
            check=1;
            for(int j=0;j<strs.length-1;j++){
                String t=strs[j],t1=strs[j+1];
                if(t.charAt(i)!=t1.charAt(i)){System.out.println("IF"+ i); return s;}
                check++;
                if(check==strs.length)s+=t.charAt(i);
            }
          
        }return s;
    }
}