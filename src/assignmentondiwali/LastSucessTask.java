package assignmentondiwali;

import java.util.Scanner;

public class LastSucessTask {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int team1[]=new int[5];
		int team2[]=new int[5];
		int team3[]=new int[5];
		int team4[]=new int[5];
		int team5[]=new int[5];
		
		int lastSucess1=0;
		System.out.println("enter the 5 results of team1 either 0 or 1");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				lastSucess1=i+1;
	
			}
		}
		System.out.println(lastSucess1+"th person is the lastsucess");
		
	    
		int lastSucess2=0;
		System.out.println("enter the 5 results of team2 either 0 or 1");
		for (int i = 0; i < team2.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team2[i]==1)
			{
				lastSucess2=i+1;
			}
		}
		
		int lastSucess3=0;
		System.out.println("enter the 5 results of team3 either 0 or 1");
		for (int i = 0; i < team3.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team3[i]==1)
			{
				lastSucess3=i+1;
			}
		}
		
		int lastSucess4=0;
		System.out.println("enter the 5 results of team4 either 0 or 1");
		for (int i = 0; i < team4.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team4[i]==1)
			{
				lastSucess4=i+1;
			}
		}
		
		int lastSucess5=0;
		System.out.println("enter the 5 results of team5 either 0 or 1 ");
		for (int i = 0; i < team5.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team5[i]==1)
			{
				lastSucess5=i+1;
			}
		}
	
			}

}
