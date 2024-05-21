import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter marks of Maths: ");
        float MarksOfMaths = sc.nextFloat();
        
        System.out.println("Enter marks of Science: ");
        float MarksOfScience = sc.nextFloat();
        
        System.out.println("Enter marks of English: ");
        float MarksOfEnglish = sc.nextFloat();
        
        System.out.println("Enter marks of Hindi: ");
        float MarksOfHindi = sc.nextFloat();
        
        System.out.println("Enter marks of Economics: ");
        float MarksOfEconomics = sc.nextFloat();
        
        float TotalMarks = MarksOfMaths + MarksOfScience + MarksOfEnglish + MarksOfHindi + MarksOfEconomics;
        float AveragePercentage = (TotalMarks / 500) * 100;

        String grade;
        if (AveragePercentage >= 91 && AveragePercentage <= 100) {
            grade = "A";
        } else if (AveragePercentage >= 81 && AveragePercentage < 91) {
            grade = "B";
        } else if (AveragePercentage >= 61 && AveragePercentage < 81) {
            grade = "C";
        } else if (AveragePercentage >= 41 && AveragePercentage < 61) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Percentage: " + AveragePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
