public class Pattern4Type2 {
    public static void main(String[] args) {
        int[] num=new int[256];
        String s="helloworld";
        int left=0;
        int right=0;
        int maxx=0;

        while(right<s.length()){
            char c=s.charAt(right);
            num[c]++;

            while(num[c]>1){
                char d=s.charAt(left++);
                num[d]--;
            }
            maxx=Math.max(maxx,right-left+1);
            right++;
        }
        System.out.println(maxx);

    }
}
