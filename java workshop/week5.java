import java.util.Scanner;
public class FixedDepositNIB {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
System.out.print("Enter principal (Rs. >=1000, 0 to exit): ");
double p = sc.nextDouble();
if (p == 0) break;
if (p < 1000) {
System.out.println("Minimum deposit Rs.1000");
continue;
}
System.out.print("Enter annual interest rate (8-12): ");
double r = sc.nextDouble();
if (r < 8 || r > 12) {
System.out.println("Rate must be 8 to 12");
continue;
}
System.out.print("Enter years (max 5): ");
int y = sc.nextInt();
if (y > 5 || y <= 0) {
System.out.println("Years must be 1 to 5");
continue;
}
double mr = r / 12 / 100;
int m = y * 12;
double a = p * Math.pow(1 + mr, m);
double fee = a * 0.005;
double finalAmt = a - fee;
System.out.println("Maturity: Rs." + a + ", Fee: Rs." + fee + ", Final: Rs." + finalAmt);
}
sc.close();
}
}