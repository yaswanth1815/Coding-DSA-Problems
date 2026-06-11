import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={10,30,40,2,3,7,4,5,22,555,111};
        Arrays.sort(arr);
        boolean value=b_search(0,arr.length-1,arr,7);
        System.out.println(value);
    }    
    public static boolean b_search(int low,int high,int[] arr,int target){
        if(low>high){
            return false;
        }
        int mid=(low+high)/2;
        if(target>arr[mid]){
            return b_search(mid+1,high,arr,target);
        }
        else if(target<arr[mid]){
            return b_search(low,mid-1,arr,target);
        }
        else if(target==arr[mid]){
            return true;
        }
        return false;
    }
}
