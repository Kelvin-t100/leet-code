class Solution {
    public String intToRoman(int num) {
        String ans="";
      int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
String[] arr1 = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<arr.length;i++){
          while(num-arr[i]>=0&&num>0){
            num=num-arr[i];
            ans=ans+""+arr1[i];
          }
        }
        return ans;
    }
}