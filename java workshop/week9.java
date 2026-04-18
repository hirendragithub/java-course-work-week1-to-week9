class Person {
int id;
String name;
double salary;
static String college = "Pokhara College";
Person(int id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
double getAnnual() {
return salary * 12;
}
}
class Teacher extends Person {
String subject;
double bonus;
Teacher(int id, String name, double salary, String subject, double bonus) {
super(id, name, salary);
this.subject = subject;
this.bonus = bonus;
}
double getAnnual() {
return super.getAnnual() + bonus;
}
}
class Staff extends Person {
int hours;
double rate;
Staff(int id, String name, double salary, int hours, double rate) {
super(id, name, salary);
this.hours = hours;
this.rate = rate;
}
double getPay() {
return hours * rate;
}
}
public class SchoolApp {
public static void main(String[] args) {
Teacher t = new Teacher(1, "Mr. Sharma", 50000, "Math", 10000);
Staff s = new Staff(2, "Mr. Thapa", 0, 160, 500);
System.out.println("Teacher Annual Salary: " + t.getAnnual());
System.out.println("Staff Salary: " + s.getPay());
System.out.println("College Name: " + Person.college);
}
}