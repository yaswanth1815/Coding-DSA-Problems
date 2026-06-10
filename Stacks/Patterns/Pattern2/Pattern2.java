import java.util.*;
class Pattern2{
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        int[] num={5,2,7,3,6,3,2,10,66};
        int[] pge_num=new int[num.length];

        for (int i=0;i<num.length;i++){
            while(!stk.empty() && stk.peek()<=num[i]){
                stk.pop();
            }
            if(stk.empty()){
                pge_num[i]=-1;
            }
            else{
                pge_num[i]=stk.peek();
            }
            stk.push(num[i]);
        }
        System.out.println(Arrays.toString(pge_num));
    }
    
}
