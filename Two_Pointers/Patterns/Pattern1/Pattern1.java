class Pattern1{
    public static void main(String[] args) {
        int[] num={1,5,3,70,2,11,4};
        int sum=num[0]+num[1]+num[2];
        int max=sum;
        int k=3;
        int left=0;
        int right=k;
        while(right<num.length){
            sum=sum-num[left++]+num[right++];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}