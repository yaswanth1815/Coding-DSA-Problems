import java.util.*;
class Pattern2{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        boolean[] freq=new boolean[arr.length];
        List<List<Integer>> st=new ArrayList<>();
        st=fun(arr,freq,new ArrayList<>(),new ArrayList<>());
        System.out.println(st);
    }
    public static List<List<Integer>> fun(int[] num, boolean[] freq, List<Integer> lst,List<List<Integer>> store){
        if (num.length==lst.size()){
            store.add(new ArrayList<>(lst));
            return store;
        }
        for(int i=0;i<num.length;i++){
            if(!freq[i]){
                lst.add(num[i]);
                freq[i]=true;

                fun(num,freq,lst,store);
                lst.remove(lst.size()-1);
                freq[i]=false;
            }
        }
        return store;
 
    }
}
