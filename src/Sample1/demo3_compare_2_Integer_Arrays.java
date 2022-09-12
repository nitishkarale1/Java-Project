package Sample1;

import java.util.Arrays;

public class demo3_compare_2_Integer_Arrays 
{
	public static void main(String[] args) 
	{
		int ar1[]= {50,100,200};
		int ar2[]= {20,40,80};
		int ar3[]= {50,100,200};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar2, ar3));
	}
	
}
