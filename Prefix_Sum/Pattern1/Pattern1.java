import java.util.*;
class Pattern1{
    public static void main(String[] args) {
        int[] nums={10,22,45,2,33,46,32};
        int[] prefix_sums=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefix_sums[i]=sum;
        }
        System.out.println(Arrays.toString(prefix_sums));
    }
}