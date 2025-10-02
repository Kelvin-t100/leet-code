class Solution {
    public List<Integer> getRow(int row) {
        ArrayList<ArrayList<Integer>> pascal=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        pascal.add(new ArrayList(List.of(1)));
        for(int i=1;i<=row;i++){
          ArrayList<Integer> prev=pascal.get(i-1);
          ArrayList<Integer> crow=new ArrayList<>();
          crow.add(1);
          for(int j=0;j<prev.size()-1;j++){
            crow.add(prev.get(j)+prev.get(j+1));
          }
          crow.add(1);
          pascal.add(crow);
        }  ans=pascal.get(row);
        return ans;
    }
}