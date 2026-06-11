import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        int[] nums={2,2,2};
        int[] nsearr=new int[nums.length];
        int[] psearr=new int[nums.length];
        
        nsearr=nse(nums,nsearr,new Stack<>());
        psearr=pse(nums,psearr,new Stack<>());
        System.out.println(Arrays.toString(nsearr));
        System.out.println(Arrays.toString(psearr));
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i-psearr[i];
            int right=nsearr[i]-i;

            sum+=(left*right*nums[i]);
        }
        System.out.println(sum);
    }

    public static int[] nse(int[] arr, int[] nse_arr, Stack<Integer> stk){
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.empty() && arr[stk.peek()]>arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                nse_arr[i]=arr.length;
            }
            else{
                nse_arr[i]=stk.peek();
            }
            stk.push(i);
        }
        return nse_arr;
    }
    public static int[] pse(int[] num,int[] pse_num,Stack<Integer> stk){

        for (int i=0;i<num.length;i++){
            while(!stk.empty() && num[stk.peek()]>=num[i]){
                stk.pop();
            }
            if(stk.empty()){
                pse_num[i]=-1;
            }
            else{
                pse_num[i]=stk.peek();
            }
            stk.push(i);
        }
        return pse_num;
    }
}
