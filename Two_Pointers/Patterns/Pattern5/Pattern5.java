import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        int left=0;
        int right=0;
        String s="abdbddjfeirjdf";
        int maxx=0;
        int maxfreq=0;
        int k=1;
        Map<Character,Integer> map=new HashMap<>();
        while(right<s.length() && right>=left){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq=Collections.max(map.values());
            while(((right-left+1)-maxfreq)>k){
                char d=s.charAt(left);
                map.put(d,map.get(d)-1);
                if (map.get(d)==0){
                    map.remove(d);
                }
                left++;
            }
            maxx=Math.max(right-left+1,maxx);
            right++;
        }
        System.out.println(maxx);
    }
}
