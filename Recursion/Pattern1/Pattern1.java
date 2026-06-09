import java.util.*;
class Pattern1{
    public static void main(String[] args) {
        List<List<Integer>> ls=new ArrayList<>();
        ls=fun(new int[]{1,2,3},0,new ArrayList<>(),new ArrayList<>());
        System.out.println(ls);
    }
    public static List<List<Integer>> fun(int[] num,int i, List<Integer> lst,List<List<Integer>> store){
        if(i==num.length){
            if(lst.size()>0){
                store.add(new ArrayList<>(lst));
            }
            return store;
        }
        lst.add(num[i]);
        fun(num,i+1,lst,store);
        lst.remove(lst.size()-1);
        fun(num,i+1,lst,store);
        return store;
    }
}
