import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        int[] num={1,0,-1,4,2,-2,-4,2,2,2,2,2,-10};
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int start=0;
        int end=0;
        int maxx=0;

        for(int i=0;i<num.length;i++){
            sum+=0;
            if (map.containsKey(sum)){
                int val=map.get(sum);
                if((i-val>maxx)){
                    maxx=Math.max(maxx,i-val);
                    start=val+1;
                    end=i;
                }
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxx);
        int[] num2=Arrays.copyOfRange(num,start,end+1);
        System.out.println(Arrays.toString(num2));
    }
}
