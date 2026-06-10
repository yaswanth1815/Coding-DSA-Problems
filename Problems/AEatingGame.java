import java.util.*;
public class AEatingGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        for(int i=0;i<cases;i++){
            int len=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            String[] arr=str.split(" ");
            int[] nums=new int[len];

            for(int j=0;j<len;j++){
                nums[j]=Integer.parseInt(arr[j]);
            }

            Arrays.sort(nums);
            int max=nums[len-1];
            int count=0;

            for(int k:nums){
                if(k==max){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}