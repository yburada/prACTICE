package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class list {

	public static void main(String[] args) {
		Object cs = new ArrayList<>();
		
		int nums[] = {1,1,2};
		 int index =0;
         for(int i=0;i<nums.length-1;i++){
        	 System.out.println(nums[i]+" "+nums[i+1]);
        	 System.out.println(nums[i] != nums[i+1]);
             if(nums[i] != nums[i+1]){
            	 nums[index] = nums[i];
                 index++;
             }
        }
         nums[index] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums));
	}

}
