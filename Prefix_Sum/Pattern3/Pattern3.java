import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        map.put(0,new ArrayList<>(Arrays.asList(-1)));
        int[] nums={1,0,-1,4,2,-2,-4};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (map.containsKey(sum)){
                List<Integer> mp=map.get(sum);
                for(int k:mp){
                    for(int m=k+1;m<=i;m++){
                        System.out.print(nums[m]+",");
                    }
                    System.out.println();
                }
                mp.add(i);
            }
            else{
                List<Integer> mp2=new ArrayList<>();
                mp2.add(i);
                map.put(sum,mp2);
            }


        }
    }
}

