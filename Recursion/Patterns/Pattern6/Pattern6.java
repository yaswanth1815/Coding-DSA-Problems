package Recursion.Patterns.Pattern6;

import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        List<List<Integer>> ls=func(5,new ArrayList<>(),new ArrayList<>(),0,new int[]{1,2,3,1});
        System.out.println(ls);
    }
    public static List<List<Integer>> func(int target,List<Integer> lst, List<List<Integer>> lst2,int ind,int[] num){
        
        if(target<=0){
            if (target==0){
                lst2.add(new ArrayList<>(lst));
            }
            return lst2;
        }
        if (ind>=num.length){
            return lst2;
        }
        lst.add(num[ind]);
        func(target-num[ind],lst,lst2,ind+1,num);
        lst.remove(lst.size()-1);
        func(target,lst,lst2,ind+1,num);
        return lst2;

    }
}
