import java.util.*; 
public class Pattern4 {
    public static void main(String[] args) {
        int[] nums={1,0,-1,4,2,-2,-4};
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(count);
    }    
}
