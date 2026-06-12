import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
         int[] nums={1,0,1,4,2,-2,-4,5};
        int sum=0;
        int des_sum=5;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int val=((sum%des_sum)+des_sum)%des_sum;
            if(map.containsKey(val)){
                count+=map.get(val);
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        System.out.println(count);
    }    
}
