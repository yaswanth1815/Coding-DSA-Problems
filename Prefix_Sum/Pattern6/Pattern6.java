import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        int[] nums={1,0,1,4,2,-2,-4,5};
        int sum=0;
        int des_sum=5;
        Map<Integer,List<Integer>> map=new HashMap<>();
        map.put(0,new ArrayList<>(Arrays.asList(-1)));
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int val=sum-des_sum;
            if(map.containsKey(val)){
                List<Integer> lst=map.get(val);
                for(int k:lst){
                    int[] nn=Arrays.copyOfRange(nums,k+1,i+1);
                    System.out.println(Arrays.toString(nn));
                }
            }
            List<Integer> llt=map.getOrDefault(sum,new ArrayList<>());
            llt.add(i);
            map.put(sum,llt);
        }
    }    
}
