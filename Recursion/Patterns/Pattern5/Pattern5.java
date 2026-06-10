package Recursion.Patterns.Pattern5;

import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Set<List<Integer>> ls=fun(0,7,new ArrayList<>(),new HashSet<>(),new int[]{1,2,3,4});
        System.out.println(ls);
    }
    public static Set<List<Integer>> fun(int ind,int target,List<Integer> lst, Set<List<Integer>> lst2,int[] num){
        if(target<=0){
            return lst2;
        }
        lst2.add(new ArrayList<>(lst));
        if(ind>=num.length){
            return lst2;
        }
        lst.add(num[ind]);
        fun(ind+1,target-num[ind],lst,lst2,num);
        lst.remove(lst.size()-1);
        fun(ind+1,target,lst,lst2,num);
        return lst2;
    }
}
