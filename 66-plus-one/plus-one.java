class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length==1){
            if(digits[0]==9) {
                int ans[]={1,0};return ans;
            }
            digits[0]+=1;return digits;
        }
    ArrayList<Integer>list=new ArrayList<>();
    int c=0;
     int t= ++(digits[digits.length-1]);
     System.out.println(t);
    for(int i=digits.length-1;i>-1;i--){ 
       if(c==1){t=++digits[i]; c=0;System.out.println("!IF");}
       if(t==10&&i==0){ list.add(0);list.add(1);c=1;System.out.println("2IF");continue;}
       if(t==10){ list.add(0);c=1;System.out.println("2IF");continue;}
       else{
       list.add(digits[i]);System.out.println("else"+digits[i]);}
    } 
    System.out.println(list);
    int arr[]=new int[list.size()];
    for(int i=list.size();i>0;i--){
        arr[i-1]=list.get(list.size()-i);
    }return arr;
    }
}