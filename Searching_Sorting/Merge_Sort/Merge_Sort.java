import java.util.*;
public class Merge_Sort {
    public static void main(String[] args) {
        int[] nums={19,1,1,1,1,1,11,1,1,1,8};
        divide(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }   
    
    public static void divide(int[] num, int start, int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        divide(num,start,mid);
        divide(num,mid+1,end);
        merge(num,start,end,mid);
    } 

    public static void merge(int[]num, int start, int end, int mid){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(num[i]<=num[j]){
                temp[k++]=num[i++];
            }
            else{
                temp[k++]=num[j++];
            }
        }

        while(i<=mid){
            temp[k++]=num[i++];
        }
        while(j<=end){
            temp[k++]=num[j++];
        }

        for(int x=0;x<temp.length;x++){
            num[start+x]=temp[x];
        }
    }
}