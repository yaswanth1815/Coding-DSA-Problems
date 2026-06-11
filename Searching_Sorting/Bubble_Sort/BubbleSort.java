import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] num={3,5,1,1,2,4,10,25,37,6,7};
    
        for (int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(i!=j){
                    if(num[i]<num[j]){
                        int temp=num[i];
                        num[i]=num[j];
                        num[j]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
  
}
