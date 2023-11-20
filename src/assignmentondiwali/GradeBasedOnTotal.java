package assignmentondiwali;

import java.util.Scanner;

public class GradeBasedOnTotal {
	
	void marksGradeUsingSwitchCase()
    {
      // score (0-100)
      int score = 90;
      String grade = null;
      
      switch(score/10) {
        // for >= 90
        case 10:
        case 9:
           grade = "A";
           break;
        // for >= 80 and <90
        case 8:
           grade = "B";
           break;
        // for >= 70 and <80
        case 7:
           grade = "C";
           break;
        // for >= 60 and <70
        case 6:
           grade = "D";
           break;
        // for >= 50 and <60
        case 5:
           grade = "E";
           break;
        // for < 50
        default:
           grade = "F";
           break;
      }
      
      // display result
      System.out.println("Grade = " + grade);
   }



//ELSE IF 
void marksGradeUsingIfElse() {
Scanner scan = new Scanner(System.in);
System.out.println("Enter percentage marks");
double percentage = scan.nextDouble();

if(percentage >= 90){
	System.out.println("Excellent: Grade A");
}else if(percentage < 90 && percentage >= 80){
	System.out.println("Very Good: Grade B");
}else if(percentage < 80 && percentage >= 70){
	System.out.println("Good: Grade C");
}else if(percentage < 70 && percentage >= 60){
	System.out.println("Satisfactory: Grade D");
}else if(percentage < 60 && percentage >= 50){
	System.out.println("Work Hard: Grade E");
}else if(percentage < 50 && percentage >= 40){
	System.out.println("Just Passed: Grade F");
}else {
	System.out.println("Failed!");
}
}


	public static void main(String[] args) {
     
		GradeBasedOnTotal grade=new GradeBasedOnTotal();
		grade.marksGradeUsingSwitchCase();
		grade.marksGradeUsingIfElse();

	}

}
