package assignmentondiwali;

public class MaxIn3integerVlaues {

	public static void main(String[] args) {
     
		int a=10;
		int b=50;
		int c=15;
		int largestValue=0;
		int maxValue=0;
		largestValue=a>b?a:b;
		maxValue=c>largestValue?c:largestValue;
		System.out.println(maxValue+" is the maximum value");
	}

}
