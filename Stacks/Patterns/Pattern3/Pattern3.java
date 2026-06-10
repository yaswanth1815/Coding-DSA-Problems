import java.util.*;
class Pattern3{
    public static void main(String[] args) {
        int[] arr={1,5,2,11,6,4,5,11,10};
        int[] nse_arr=new int[arr.length];
        Stack<Integer> stk=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stk.empty() && stk.peek()>=arr[i]){
                stk.pop();
            }
            if(stk.empty()){
                nse_arr[i]=-1;
            }
            else{
                nse_arr[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        System.out.println(Arrays.toString(nse_arr));
    }
}