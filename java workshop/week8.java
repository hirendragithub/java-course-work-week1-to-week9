class Patient {
String name;
int age;
int days;
double charge;
Patient(String name, int age, int days, double charge) {
this.name = name;
this.age = age;
this.days = days;
this.charge = charge;
}
double getBill() {
double total = days * charge;
if (days > 7) {
total = total - (total * 0.10);
}
return total;
}
}
public class HospitalBilling {
public static void main(String[] args) {
Patient p1 = new Patient("Hari", 45, 5, 2000);
Patient p2 = new Patient("Gita", 30, 10, 1500);
System.out.println("Patient: " + p1.name + ", Bill: Rs." + p1.getBill());
System.out.println("Patient: " + p2.name + ", Bill: Rs." + p2.getBill());
}
}