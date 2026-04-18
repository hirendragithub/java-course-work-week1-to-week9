import java.util.Scanner;
public class RickshawFare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter distance in km: ");
double d = sc.nextDouble();
System.out.print("Enter time in minutes: ");
double t = sc.nextDouble();
System.out.print("Is customer local? (true/false): ");
boolean local = sc.nextBoolean();
System.out.print("Is travel during night? (true/false): ");
boolean night = sc.nextBoolean();
double fare = 50 + (d * 30) + (t * 5);
if (local && d > 5) {
fare = fare - (fare * 0.1);
}
if (night) {
fare = fare + (fare * 0.2);
}
System.out.println("Rs. " + fare);
sc.close();
}
}