package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class common_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs[] = new  String[] {"ab", "a"};
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		String s = strs[0];
        String res = "";
        for(int i=0;i<s.length();i++){
        	int count =0;
            for(int j=1;j<strs.length;j++){
            	//System.out.println(i+"   "+j);
            	System.out.println(strs[0].charAt(i) +"   "+ strs[j].charAt(i));
                if(strs[0].charAt(i) == strs[j].charAt(i)){
                    //res+=strs[0].charAt(i);
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count+"   "+strs.length );
            if(count==strs.length-1) {
            	res+=strs[0].charAt(i);
            	System.out.println(res);
            }
            else {
            	break;
            }
        }
	}

}
