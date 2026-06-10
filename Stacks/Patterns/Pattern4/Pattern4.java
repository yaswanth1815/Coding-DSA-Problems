

import java.util.*;
class Pattern3{
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        int[] num={5,2,7,3,6,3,2,10,66};
        int[] pse_num=new int[num.length];

        for (int i=0;i<num.length;i++){
            while(!stk.empty() && stk.peek()>=num[i]){
                stk.pop();
            }
            if(stk.empty()){
                pse_num[i]=-1;
            }
            else{
                pse_num[i]=stk.peek();
            }
            stk.push(num[i]);
        }
        System.out.println(Arrays.toString(pse_num));
    }
    
}

