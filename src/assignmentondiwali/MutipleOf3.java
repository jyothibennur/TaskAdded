package assignmentondiwali;

public class MutipleOf3 {
	
	static void multiplicationUsingWhile()
	{
	 int multiplier = 3;
     int i = 1;

     while (i <= 10) {
         int result = multiplier * i;

         // Skip even numbers
         if (result % 2 != 0) {
             System.out.println(multiplier + " * " + i + " = " + result);
         }

         i++;
     }
}
	
	//DO WHILE LOOP
	static void multiplicationUsingDoWhile()
	{
	   int multiplier = 3;
       int i = 1;

       do {
           int result = multiplier * i;

           // Skip even numbers
           if (result % 2 != 0) {
               System.out.println(multiplier + " * " + i + " = " + result);
           }

           i++;
       } while (i <= 10);
   }
	
	
	//FOR LOOP
 static void multiplicationUsingForLoop()
 {
	 int multiplier = 3;

     for (int i = 1; i <= 10; i++) 
     {
         int result = multiplier * i;
     

         // Skip even numbers
         if (result % 2 != 0) 
         {
             System.out.println(multiplier + " * " + i + " = " + result);
         }
     }
 }

	public static void main(String[] args) {

//		multiplicationUsingWhile();	
//		multiplicationUsingDoWhile();
		multiplicationUsingForLoop();
	}

}
