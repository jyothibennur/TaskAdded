package assignmentondiwali;

public class Pattern12345 {

	public static void main(String[] args) {
		int n=5;
		int x;
		for(int i=1;i<=n;i++)
		{
		    x=1;
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
				System.out.print(x++);
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}

	}

}
