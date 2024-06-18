import java.text.ParseException;
public class EmployeeDetails extends Person {
private int empId;
private double salary;
public EmployeeDetails(String name, String dob, int empId, double salary) throws
ParseException {
super(name, dob);
this.empId = empId;
this.salary = salary;
}
public void displayEmployeeDetails() {
System.out.println(&quot;Employee ID: &quot; + empId);
System.out.println(&quot;Salary: $&quot; + salary);
}
}