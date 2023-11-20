package assignmentondiwali;

import java.util.Arrays;

public class MaxAndMinInArray {

	public static void main(String[] args) {
      
		int array[]= {12,13,16,5,3,25,76};
		Arrays.sort(array);
		System.out.println(array[0]+" is the minimum value in the given array");
		System.out.println(array[array.length-1]+" is the maximun value in given array");
	}

}
