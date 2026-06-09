import java.util.*;
public class Pattern4 {
        public static void main(String[] args) {
        List<List<Integer>> ls=new ArrayList<>();
        ls=fun(3,new int[]{1,2,3,4},0,new ArrayList<>(),new ArrayList<>());
        System.out.println(ls);
    }
    public static List<List<Integer>> fun(int k,int[] num,int i, List<Integer> lst,List<List<Integer>> store){
        if(i==num.length){
            if(lst.size()==k){
                store.add(new ArrayList<>(lst));
            }
            return store;
        }
        lst.add(num[i]);
        fun(k,num,i+1,lst,store);
        lst.remove(lst.size()-1);
        fun(k,num,i+1,lst,store);
        return store;
    }
}

