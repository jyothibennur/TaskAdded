package assignmentondiwali;

public class TimeTable {

	static void tablesPattern()
	{
		 System.out.print("* |");
	     for (int i = 1; i <= 9; i++) {
	         System.out.print(" " + i);
	     }
	     System.out.println("\n-------------------------------");

	     // Print the multiplication table
	     for (int i = 1; i <= 9; i++) {
	         System.out.print(i + " |");
	         for (int j = 1; j <= 9; j++) {
	             System.out.print(" " + (i * j));
	         }
	         System.out.println();
	     }
	}

	public static void main(String[] args) {
		
            tablesPattern();


		
	}

}
