import java.math.*;
class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
        return 0;

        String t="";
        int ind=0;
        while(ind<s.length()&& s.charAt(ind)==' ' ){ ind++;}
        if(ind!=s.length())
        s=s.substring(ind);
        else return 0;
        System.out.println(s+" S");
        int a=0;
        boolean sign=(s.charAt(0)=='-')?true:false;
        if(s.charAt(0)=='+') s=s.substring(1);
        for( int i=(sign==true)?1:0;i<s.length();i++){
            if((s.charAt(i)>=48&&s.charAt(i)<=57))
            t=t+s.charAt(i);
            else
            break;
        }
        System.out.println(t);
        //int wer=0;
        // if(t.length()==1){
        //     if(t.charAt(0)>=48 && t.charAt(0)<=57) {wer=Integer.parseInt(t);return wer;}
        //     else return 0;
        // }
        if(t.length()!=0 ){
         BigInteger num= new BigInteger(t);
         if (num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
                return (sign ? Integer.MIN_VALUE : Integer.MAX_VALUE);
            } else if (num.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
                return (sign ? Integer.MIN_VALUE : Integer.MAX_VALUE);
            }
        a=num.intValue();
        if(sign)a*=-1;
        System.out.println(a+"A");}
        return a;
    }
}