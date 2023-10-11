import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
	  int low=1;
	  int high=(int)N;
	  while(low<=high)
	  {
		  long mid=low+(high-low)/2;
		  long val=mid*mid;
		  if(val<=N)
		  {
			  low=(int)mid+1;
		  }
		  else
		  {
			  high=(int)mid-1;
		  }
	 }
	 return high;
	}
}
