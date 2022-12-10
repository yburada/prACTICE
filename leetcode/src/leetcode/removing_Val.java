package leetcode;

import java.util.Arrays;

public class removing_Val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,2,3};
		int val = 3;
		int index =0;
		for(int i=0;i<nums.length;i++){
            if(nums[i]!= val){
                nums[index] = nums[i];
                index++;
            }
        }
		System.out.println(index-=1);
        System.out.println(Arrays.toString(nums));
				

	}

}
