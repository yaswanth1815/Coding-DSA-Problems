public class Pattern7 {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1};
        int k=2;
        int sum=0;
        int count=0;
        int first=func(0,arr,0,0,0,2);
        int second=func(0,arr,0,0,0,1);
        System.out.println(first-second);
    }

    public static int func(int count,int[] num,int left, int right,int sum, int k){
        while(right<num.length){
            sum+=num[right];
            while(sum>k){
                sum-=num[left++];
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}
