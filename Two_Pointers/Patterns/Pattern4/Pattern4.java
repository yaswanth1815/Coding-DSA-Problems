import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        String s="asdfghjklal";
    Map<Character,Integer> map=new HashMap<>();
    int left=0;
    int right=0;
    int maxx=0;

    while(right<s.length() && right>=left){
        char c=s.charAt(right);
        map.put(c,map.getOrDefault(c,0)+1);

        while(map.get(c)>1){
            char d=s.charAt(left++);
            map.put(d,map.get(d)-1);
            if(map.get(d)==0){
                map.remove(d);
            }
        }
        maxx=Math.max(maxx,right-left+1);
        right++;

    }
    System.out.println(maxx);
    }
    
}
