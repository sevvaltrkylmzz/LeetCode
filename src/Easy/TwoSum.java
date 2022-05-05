package Easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int []wanted=new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < (nums.length);j++){
                if(nums[i]+nums[j] == target){
                    wanted[0]=nums[i];
                    wanted[1]=nums[j];
                }}

        }
        return wanted;
    }
    public static void main(String[] args) {
        int [] result ;
        int []nums=new int[]{3,5,12,6};
        int target=18;
        result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
