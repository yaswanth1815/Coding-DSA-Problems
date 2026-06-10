public class Pattern2 {
    public static void main(String[] args) {
        int left=0;
        int right=0;
        int[] num={2,5,7,1,4,4,3,2,5};
        int k=10;
        int sum=0;
        int maxx=Integer.MIN_VALUE;
        while(right<num.length && right>=left){
            sum+=num[right];
            while(sum>=k){
                sum-=num[left++];
            }
            maxx=Math.max(maxx,right-left+1);
            right++;
        }
        System.out.println(maxx);
    }
}
