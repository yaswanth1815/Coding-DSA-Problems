import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        int[] nums={1,5,8,78,25,77,3,2,12,20};
        Stack<Integer> stk=new Stack<>();
        int[] cnge_nums=new int[nums.length-1];

        for(int i=2*nums.length-1;i>=0;i--){
            int idx=i%(nums.length-1);

            while(!stk.empty() && stk.peek()>=nums[idx]){
                stk.pop();
            }
            if(!stk.empty()){
                cnge_nums[idx]=stk.peek();
            }
            else{
                cnge_nums[idx]=-1;
            }
            stk.push(nums[idx]);
        }
        System.out.println(Arrays.toString(cnge_nums));
    }
}
