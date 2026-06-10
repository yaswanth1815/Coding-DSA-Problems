import java.util.*;
public class Coding2 {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,1,5,4,3,2,1,0,-1,-2,-3,-4,-5};
        int max=Integer.MIN_VALUE;
        ArrayDeque<Integer> que=new ArrayDeque<>();
        int right=0;

        while(right<arr.length){
            while(!que.isEmpty() && que.peekLast()-arr[right]>1){
                que.poll();
            }
            que.offer(arr[right]);
            max=Math.max(max,que.size());
            right++;
        }
        System.out.println(max);
    }
}
