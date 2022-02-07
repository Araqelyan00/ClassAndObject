package employee;
//  id, name, department, age, gender
public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sarah", "DEV", 24, "f");
        Employee employee2 = new Employee(2, "Ann", "PM", 22, "f");
        Employee employee3 = new Employee(3, "Tom", "DEV", 20, "m");
        Employee employee4 = new Employee(4, "James", "DEV", 24, "m");
        Employee employee5 = new Employee(5, "Mark", "PO", 32, "m");

        employee1.EmployeeInfo();
        employee2.EmployeeInfo();
        employee3.EmployeeInfo();
        employee4.EmployeeInfo();
        employee5.EmployeeInfo();
    }
}
