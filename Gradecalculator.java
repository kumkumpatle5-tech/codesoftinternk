import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of subjects: ");
        int subjects = sc.nextInt();
        
        double totalmarks = 0;
        
        // Input marks 
        for(int i = 1; i <= subjects; i++) {
            System.out.print("enter marks for subject " + i + " (0-100): ");
            totalmarks += sc.nextDouble();
        }
        
        
        double average = totalmarks / subjects;
        double percentage = (totalmarks / (subjects * 100)) * 100;
        
        
        String grade = getGrade(percentage);
        
        
        System.out.println("Total: " + totalmarks);
        System.out.println("Avg: " + average);
        System.out.println("Grade: " + grade);
    }
    
    public static String getGrade(double percentage) {
        if(percentage >= 90) return "A+";
        else if(percentage >= 80) return "A";
        else if(percentage >= 70) return "B";
        else if(percentage >= 60) return "C";
        else if(percentage >= 50) return "D";
        else return "F";
    }
}
