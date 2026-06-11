import java.util.*;

public class Pattern8 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        int[] nge = nextGreater(nums);
        int[] pge = prevGreater(nums);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            long left = i - pge[i];
            long right = nge[i] - i;
            sum += (long) nums[i] * left * right;
        }
        System.out.println(sum);
    }

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        return nge;
    }

    public static int[] prevGreater(int[] arr) {
        int n = arr.length;
        int[] pge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pge[i] = -1;
            } else {
                pge[i] = st.peek();
            }
            st.push(i);
        }
        return pge;
    }
}
