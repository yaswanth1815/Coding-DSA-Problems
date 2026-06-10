import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        List<String> ret=fun("hell",0,0,new ArrayList<>());
        System.out.println(ret);
    }
    public static List<String> fun(String s,int start, int end, List<String> lst){
        if (start==s.length()){
            return lst;
        }
        if (end==s.length()){
            return fun(s,start+1,start+1,lst);
        }
        String s2=s.substring(start,end+1);
        lst.add(s2);
        fun(s,start,end+1,lst);
        return lst;
    }
}
