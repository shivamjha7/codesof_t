import java.util.*;

public class studentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter marks for subject 1 out of 100");
        int s1 = sc.nextInt();

        System.out.println("Enter marks for subject 2 out of 100");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for subject 3 out of 100");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for subject 4 out of 100");
        int s4 = sc.nextInt();

        System.out.print("Enter marks for subject 5 out of 100");
        int s5 = sc.nextInt();

        int total=s1+s2+s3+s4+s5;
        double AveragePercentage= total/5;

        String grade;
        if(AveragePercentage >=90){
            grade = "A+";
        }
        else if(AveragePercentage >=80){
            grade = "A";
        }
        else if (AveragePercentage >= 70) {
            grade = "B";
        }
         else if (AveragePercentage >= 60) {
            grade = "C";
        } 
        else if (AveragePercentage >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }
      
        // Display result
        System.out.println("**********************************************");

        System.out.println("Total Marks:" +" "+ total);
        System.out.println("Average Percentage :"+" "+ AveragePercentage);
        System.out.println("Grade :"+ " "+grade);

        System.out.println("**********************************************");



        
        
    }
    
}
