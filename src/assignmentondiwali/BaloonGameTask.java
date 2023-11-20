package assignmentondiwali;

import java.util.Arrays;
import java.util.Scanner;

public class BaloonGameTask {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		int team1[]=new int[5];
		int team2[]=new int[5];
		int team3[]=new int[5];
		int team4[]=new int[5];
		int team5[]=new int[5];
		
		int count1=0;
		System.out.println("enter the 5 results of team1 either 0 or 1");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				count1++;
			}
		}
		
		int count2=0;
		System.out.println("enter the 5 results of team2 either 0 or 1");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				count2++;
			}
		}
		
		int count3=0;
		System.out.println("enter the 5 results of team3 either 0 or 1");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				count3++;
			}
		}
		
		int count4=0;
		System.out.println("enter the 5 results of team4 either 0 or 1");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				count4++;
			}
		}
		
		int count5=0;
		System.out.println("enter the 5 results of team5 either 0 or 1 ");
		for (int i = 0; i < team1.length; i++) 
		{
			team1[i]=sc.nextInt();
			if(team1[i]==1)
			{
				count5++;
			}
		}
		
		int result[]= {count1,count2,count3,count4,count5};
		Arrays.sort(result);
	   if(result[result.length-1]==count1) {
	        System.out.println("The winning team is team1");
	   }else if(result[result.length-1]==count2){
		   System.out.println("The winning team is team2");
	   }
	   else if(result[result.length-1]==count3){
		   System.out.println("The winning team is team3");
	   }else if(result[result.length-1]==count4){
		   System.out.println("The winning team is team4");
	   }else if(result[result.length-1]==count5){
		   System.out.println("The winning team is team5");
	   }
	   
		
  }

}
