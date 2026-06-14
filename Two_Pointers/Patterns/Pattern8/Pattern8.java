import java.math.BigInteger;

class Pattern8 {
    public static void main(String[] args) {
        int minn=Integer.MAX_VALUE;
        int sum=0;
        int right=0;
        int left=0;
        int[] nums = {2,3,1,2,1,3};
        int target=70;

        while(right<nums.length){
            sum+=nums[right];

            while(sum>=target){
                minn=Math.min(right-left+1,minn);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if(minn==Integer.MAX_VALUE){
            System.out.println("0");
        }
        else{
            System.out.println(minn);
        }
    }
}