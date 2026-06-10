import java.util.*;
class Coding1{
    public static void main(String[] args) {
        int[] num={1,1,2,2,3,3,3};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:num){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> lst=new ArrayList<>(map.entrySet());
        Collections.sort(lst,(a,b)->{
            int ret=Integer.compare(b.getValue(),a.getValue());
            if(ret==0){
                ret=Integer.compare(a.getKey(),b.getKey());
            }
            return ret;
        }); 
        int max=(int)lst.get(0).getValue();
        for(Map.Entry e:lst){
            if((int)e.getValue()<max){
                System.out.println(e.getKey());
                break;
            }
        }
        System.out.println(lst);
    }
}