package assignmentondiwali;

public class CoreNutsPattern {

	public static void main(String[] args) {
		String value= "corenuts";
		int n=value.length();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(value.charAt(j-1));
			}
			System.out.println();

			}
		

		}
	}


