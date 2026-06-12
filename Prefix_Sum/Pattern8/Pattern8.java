import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        int[] num={5,3,-1, 0, 1, 4, 2, -2, -4, 5,-3};
        int maxx=0;
        int start=0;
        int end=0;
        int sum=0;
        int target=5;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            int val=sum-target;
            
            if (map.containsKey(val)){
                int a=map.get(val);
                maxx=Math.max(maxx,i-a);
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxx);
    }
}
