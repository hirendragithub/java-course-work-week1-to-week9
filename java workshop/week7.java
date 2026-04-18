import java.util.Scanner;
class BankAccount {
int accNo;
String name;
double bal;
BankAccount(int accNo, String name, double bal) {
this.accNo = accNo;
this.name = name;
this.bal = bal;
}
void deposit(double amt) {
bal = bal + amt;
}
boolean withdraw(double amt) {
if (amt <= bal) {
bal = bal - amt;
return true;
}
return false;
}
double getBalance() {
return bal;
}
}
public class BankSystem {
public static void main(String[] args) {
BankAccount a1 = new BankAccount(101, "Ram", 5000);
BankAccount a2 = new BankAccount(102, "Sita", 8000);
a1.deposit(2000);
a2.withdraw(1000);
System.out.println("Account 1 balance: " + a1.getBalance());
System.out.println("Account 2 balance: " + a2.getBalance());
}
}