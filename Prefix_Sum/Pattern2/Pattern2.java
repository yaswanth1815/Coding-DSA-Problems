public class Pattern2 {
    public static void main(String[] args) {
        int[] nums={10,22,45,2,33,46,32,33,25,22,67,69};
        int start=3;
        int end=6;
        int sum=0;
        for(int i=0;i<end+1;i++){
            sum+=nums[i];
            if(i>=start){
                System.out.print(sum+",");
            }
        }
    }
    
}
