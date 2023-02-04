package longestSubSequence;

import java.util.Arrays;

public class susobhan {
	public static void main(String args[]) {
		int arr[]= {36,41,56,35,44,33,34,92,43,32,42};
		Arrays.sort(arr);
		int n = arr.length;
		int count=0;
		int maxcount=0;
		for(int i=0;i<n-1;i++) {
			if((arr[i]+1)==arr[i+1] ){
				count++;
				
				if(maxcount<count) {
					maxcount= count;
				}
				
			}
			else {
				count=0;
			}
			
		}
		System.out.print(maxcount+1);
	}

}
