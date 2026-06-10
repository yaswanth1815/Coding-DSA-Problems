class Pattern3{
    public static void main(String[] args) {
        int[] num={40,30,22,1,34,56,78,99};
        int summ=0;
        int k=4;
        for (int i=0;i<k;i++){
            summ+=num[i];
        }
        int mmax=summ;

        int left=k-1;
        int right=num.length-1;

        while(right>=k && left>=0){
            summ=summ-num[left--]+num[right--];
            mmax=Math.max(summ,mmax);
        }
        System.out.println(mmax);
    }
}