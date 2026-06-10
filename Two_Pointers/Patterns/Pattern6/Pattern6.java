class Pattern6{
    public static void main(String[] args) {
        String s="abcabc";
        int[] check=new int[3];
        int count=0;
        int left=0;
        int right=0;

        while(right<s.length()){
            char c=s.charAt(right);
            check[c-'a']++;
            while(check[0]>0 && check[1]>0 && check[2]>0){
                count+=(s.length()-(right));
                char d=s.charAt(left);
                check[d-'a']--;
                left++;
            }
            right++;
        }
    System.out.println(count);
    }
}