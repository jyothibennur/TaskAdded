package exception20thnov;

public class TestTask extends Super {
	

//	static void m1()throws  ArithmeticException, FileNotFoundException
//	{
//		m2();
//	}
//	static void m2() throws FileNotFoundException
//	{
//		
//	}
//	public static void main(String[] args) {
//	  try {
//		m1();
//	} catch (ArithmeticException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	void add() throws ArithmeticException
	{
		System.out.println(10/0);

}
	public static void main(String[] args) {
		TestTask task=new TestTask();
		task.add();
	}

}
