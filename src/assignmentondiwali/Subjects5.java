package assignmentondiwali;

import java.util.Scanner;

public class Subjects5 {

	public static void main(String[] args) {
     
//		int marks[]=new int[5];
//		float sum=0;
//		float average,amp;
//		int max=0;
//		int min=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter marks for 5 subjects");
//		for(int i=0;i<marks.length;i++)
//		{
//			marks[i]=sc.nextInt();
//			if(marks[i]<min)
//			{
//				min=marks[i];
//			}
//			
//			if(marks[i]>max)
//			{
//				max=marks[i];
//			}
//			sum=sum+marks[i];
//			
//		}
//		average=sum/5;
//		amp=(sum/500)*100;
//		
//		
//		System.out.println("the maximum value= "+max);
//		System.out.println("the minimum value= "+min);
//		System.out.println("average marks= "+average);
//		System.out.println("amp= "+amp+"%");
//		
		
		Scanner scanner = new Scanner(System.in);

        // Accept marks for 5 subjects from the user
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Find minimum, maximum, and average marks
        int minMark = marks[0];
        int maxMark = marks[0];
        int totalMarks = marks[0];

        for (int i = 1; i < 5; i++) {
            // Minimum
            if (marks[i] < minMark) {
                minMark = marks[i];
            }

            // Maximum
            if (marks[i] > maxMark) {
                maxMark = marks[i];
            }

            // Total for average calculation
            totalMarks += marks[i];
        }

        // Calculate average
        double averageMarks = (double) totalMarks / 5;

        // Calculate percentage
        double percentage = (double) totalMarks / (5 * 100) * 100;

     
        System.out.println("Minimum Marks: " + minMark);
        System.out.println("Maximum Marks: " + maxMark);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Percentage: " + percentage + "%");

		
	}

}
