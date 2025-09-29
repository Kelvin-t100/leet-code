class Solution {
    public List<List<Integer>> generate(int row) {
        List<List<Integer>> pascal =new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for(int i=1;i<row;i++){
            ArrayList<Integer> crow=new ArrayList<>();
            List<Integer> prev=pascal.get(i-1);
            crow.add(1);
            for(int j=0;j<prev.size()-1;j++){
                crow.add(prev.get(j)+prev.get(j+1));
            }crow.add(1);
        pascal.add(crow);}
        return pascal;

    }
}