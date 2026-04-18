import java.util.Scanner;
public class ScholarshipChecker {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter GPA (0.0 to 4.0): ");
double gpa = sc.nextDouble();
if (gpa < 0.0 || gpa > 4.0) {
System.out.println("Invalid GPA");
} else {
String grade;
if (gpa >= 3.7) grade = "A";
else if (gpa >= 3.3) grade = "B+";
else if (gpa >= 3.0) grade = "B";
else if (gpa >= 2.7) grade = "C+";
else if (gpa >= 2.0) grade = "C";
else if (gpa >= 1.0) grade = "D";
else grade = "F";
System.out.println("Grade: " + grade);
if (gpa >= 3.5) {
System.out.println("Eligible for scholarship");
} else {
System.out.println("Not eligible for scholarship");
}
}
sc.close();
}
}