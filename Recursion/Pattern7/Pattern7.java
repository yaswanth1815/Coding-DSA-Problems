import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        List<List<Integer>> ll=fun(5,new int[]{1,2,3},0,new ArrayList<>(),new ArrayList<>());
        System.out.println(ll);
    }
    public static List<List<Integer>> fun(int target,int[] num, int ind, List<Integer> lst1, List<List<Integer>> lst2){
        if (target<=0){
            if (target==0){
                lst2.add(new ArrayList<>(lst1));
                return lst2;
            }
            return lst2;
        }
        if(ind==num.length){
            return lst2;
        }
        lst1.add(num[ind]);
        fun(target-num[ind],num,ind,lst1,lst2);
        lst1.remove(lst1.size() - 1);
        fun(target,num,ind+1,lst1,lst2);
        return lst2;
    }
}
