public class LinearSearch {
    public static void main(String[] args) {
        int[] nums={1,4,22,14,6,23,33};
        int target=33;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
